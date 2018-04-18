package com.patrickpu.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Contacts {
    public static void main(String[] args) {
    	
        HashSet<String> set = new HashSet();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            if (op.equals("add")) {
            	set.add(contact);
            }else if(op.equals("find")){
            	System.out.println(findMatchInSet(set, contact));
            }
        }
    }
    
    public static int findMatchInSet(Set<String> set, String str) {
    	int i = 0;
    	
    	for (String s : set) {
    		if(s.startsWith(str)) {
    			i++;
    		}
    	}
    	return i;
    }
}
