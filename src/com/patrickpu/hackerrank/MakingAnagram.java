package com.patrickpu.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MakingAnagram {
	public static Integer numberNeeded(String first, String second) {
	      HashMap<Character, Integer> map1 = convertStringToMap(first);
	      HashMap<Character, Integer> map2 = convertStringToMap(second);
	        
	      HashSet<Character> set = new HashSet();
	        set.addAll(map1.keySet());
	        set.addAll(map2.keySet());
	        
	      Integer count = 0;
	        
	        for (Character c : set){
	            count += checkDiff(c, map1, map2);
	        }
	        
	        return count;
	    }
	    
	    public static Integer checkDiff(Character c, HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
	        Integer integer1 = 0;
	        Integer integer2 = 0;
	        
	        if (map1.containsKey(c)){
	            integer1 = map1.get(c);
	        }
	        
	         if (map2.containsKey(c)){
	            integer2 = map2.get(c);
	        }
	        
	        return Math.abs(integer1 - integer2);
	    }
	    
	    public static HashMap<Character, Integer> convertStringToMap(String str){
	        HashMap<Character, Integer> map = new HashMap();
	        char[] strArr = str.toCharArray();
	        
	        for (Integer i=0; i<strArr.length; i++){
	            addByKey(map, strArr[i]);   
	        }
	        
	        return map;
	    }
	    
	    public static void addByKey(HashMap<Character, Integer> map, Character key){
	        if(!map.containsKey(key)){
	            map.put(key, 1);
	        }else{
	            map.put(key, map.get(key) + 1);
	        }
	    }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	    }
}
