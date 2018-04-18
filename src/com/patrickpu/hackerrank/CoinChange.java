package com.patrickpu.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CoinChange {
	
	static int n;
	static int m;
	static ArrayList<Integer> coinTypes = new ArrayList<Integer>();
	static HashMap<Integer, CoinSolution> map = new HashMap<Integer, CoinSolution>(); 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        
        for(int coins_i=0; coins_i < m; coins_i++){
        	coinTypes.add(in.nextInt());
        }
        
        
        
    }
    
    static void generateCoinSolution(int target) {
    	CoinSolution coinSolution = new CoinSolution(target);
    	int ways = 0;
    	for (int i = 0; i<coinTypes.size(); i++) {
    		int type = coinTypes.get(i);
    		ways += map.get(target - type).ways;
    	}
    	coinSolution.ways = ways;
    	map.put(target, coinSolution);
    }
    
    static class CoinSolution {
    	
    	int target;
    	int ways = 0;
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	CoinSolution(int target){
    		this.target = target;
    	}
    	
    }
    
    public static long makeChange(int[] coins, int money) {
        long[] DP = new long[money + 1]; // O(N) space.
        DP[0] = (long) 1; 	// n == 0 case.
        for(int coin : coins) {
            for(int j = coin; j < DP.length; j++) {
            // The only tricky step.
                DP[j] += DP[j - coin];
            }
        }       
        return DP[money];
    }
    
//  public static int count(int a, List<Integer> array) {
//	int result = 0;
//	
//	for (int i=0; i<array.size(); i++) {
//		int cur = array.get(i);
//	}
//	
//	return result;
//}
}

