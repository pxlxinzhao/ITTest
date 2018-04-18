package com.patrickpu.hackerrank;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindRunningMedian {
	
	  public static void main(String[] args) {
		  
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        
		    PriorityQueue<Integer> smallHeap = new PriorityQueue<Integer>(n/2 + 1, Collections.reverseOrder()); 
		    PriorityQueue<Integer> bigHeap = new PriorityQueue<Integer>(n/2 + 1); 
		    double median = 0.0;
		    
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	            
	            if (a_i == 0) {
	            	print(a[a_i]);
	            	continue;
	            }
	            
	            if (a_i == 1) {
	            	if (a[0] <= a[1]) {
	            		smallHeap.add(a[0]);
	            		bigHeap.add(a[1]);
	            	}else {
	            		bigHeap.add(a[0]);
	            		smallHeap.add(a[1]);
	            	}
	            }
	            
	            if (a_i > 1) {
	            	if (a[a_i] > median) {
	            		bigHeap.add(a[a_i]);
	            		if (bigHeap.size() - smallHeap.size() >= 2) smallHeap.add(bigHeap.remove());
	            	}else {
	            		smallHeap.add(a[a_i]);
	            		if (smallHeap.size() - bigHeap.size() >= 2) bigHeap.add(smallHeap.remove());
	            	}
	            	
	            }

	            median = getMedian(smallHeap, bigHeap);
	            
	            print(median);
	        }
	    }
	  
	  public static double getMedian(PriorityQueue<Integer> smallHeap, PriorityQueue<Integer> bigHeap) {
		  if (smallHeap.size() > bigHeap.size()) {
			  return smallHeap.peek();
		  }else if(bigHeap.size() > smallHeap.size()) {
			  return bigHeap.peek();
		  }else {
			  return (new Double(smallHeap.peek()) + new Double(bigHeap.peek()))/2; 
		  }
	  }
	  
	  public static void print (int i ) {
		  System.out.println(String.format("%.1f", new Double(i)));
	  }
	  
	  public static void print (double d ) {
		  System.out.println(String.format("%.1f", d));
	  }
      
//      
//      if(a_i == 0) {
//      	bigMedian = a[0];
//      	print(bigMedian);
//      }
//      
//      if(a_i == 1) {
//      	
//      }
      
//      insertionSort(a, a_i);
//      printMedian(a, a_i+1);
	  
//	  public static void insertionSort(int[] arr, int index) {
//		int cur =  arr[index];
//		int j = index - 1;
//		
//		while(j>=0 && arr[j] > cur) {
//			arr[j+1] = arr[j];
//			j--;
//		}
//		
//		arr[j+1] = cur;
//	  }
//	  
//	  public static void printMedian(int[] arr, int len) {
//		  if (len%2 == 0) {
//			  System.out.println( String.format("%.1f",(new Double(arr[len/2])+new Double(arr[len/2-1])) / 2 ));
//		  }else {
//			  System.out.println( String.format("%.1f", new Double(arr[len/2])));
//		  }
//	  }
	  
}
