package com.patrickpu.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
    	Stack<Character> stack = new Stack<Character>();
    	
    	char[] arr = expression.toCharArray();
    	
    	for (int i=0; i<arr.length; i++){
    		char c = arr[i];
    		
    		if (c == '{' || c == '[' || c == '(') {
    			stack.push(c);
    		}else {
    			if (stack.isEmpty()) return false;
    			
    			char p = stack.pop().charValue();
    			
    			boolean ba = (p != '{' && c == '}');
    			boolean bb = (p != '[' && c == ']');
    			boolean bc = (p != '(' && c == ')');
    			
    			if (ba || bb || bc) {
    				return false;
    			} 
    		}
    	}
    	
    	if (!stack.isEmpty()) return false;
    	
    	return true;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
