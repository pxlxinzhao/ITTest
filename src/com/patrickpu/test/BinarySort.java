package com.patrickpu.test;

public class BinarySort {
	public static void main(String[] args) {
		int[] arr = {0, 12, 17, 23, 31, 37, 46, 54, 72, 88, 100};
		
		binarySearch(arr, 12, 0, 11);
	}
	
	static int binarySearch( int arr[] , int x , int low , int high )
	{
	    int mid;
	    while( low < high ) {
	        mid = ( high + low ) / 2;
	        if( arr[mid]== x ) {
	            break;
	        }
	        else if( arr[mid] > x ) {
	            high=mid-1;
	        }
	        else {
	            low= mid+1;
	        }
	        
	        System.out.println("high: " + high + " low: " + low);
	    }
	    
	
	    mid = ( high + low ) / 2;
	    if (x<=arr[mid])
	        return mid;
	    else 
	        return mid+1;
	}
	
	
	static void print(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
}
