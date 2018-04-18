package com.patrickpu.test.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SubSetGenerator {

	ArrayList<Integer> list = new ArrayList<Integer>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
	}};
	
	ArrayList<Integer> emptyList = new ArrayList<Integer>();
	int cursor = 0;
	//recursive
	
	public void startPrint() {
		System.out.println(emptyList);
		printSetRecursively(emptyList, cursor);
	}
	
	public void printSetRecursively(List<Integer> subList, Integer cursor) {
		
		if (cursor >= list.size()) {
			return; 
		}else {
			Integer newElement = list.get(cursor);
			List<Integer> newSubList = copyList(subList);
			newSubList.add(newElement);
			System.out.println(newSubList);
			printSetRecursively(subList, cursor+1);
			printSetRecursively(newSubList, cursor+1);
		}
		
		
//		if (list.size() == 0) {
//			return; 
//		}else {
////			System.out.println(subList);
//			printSetRecursively(copyList(subList), list.subList(1,list.size()));
//			
//			List<Integer> newSubList = copyList(subList);
//			newSubList.add(list.get(0));
//			System.out.println(newSubList);
//			printSetRecursively(newSubList, list.subList(1,list.size()));
//		}
		
	}
	
	public List<Integer> copyList(List<Integer> list){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.addAll(list);
		return newList;
	}
	
//	public void printHelper(ArrayList<Integer> list) {
//		
//	}
	
	
	//iterative method
	public void printSubSet() {
		int length = list.size();
		
		for (int i = 0; i < Math.pow(2, length); i++) {
			createSublist(i);
		}
	}

	private void createSublist(int i) {
		ArrayList<Integer> subList = new ArrayList<Integer>();
		int cursor = 0;
		
		while(i > 0) {
			if (i % 2 == 1) {
				subList.add(list.get(cursor));
			}
			
			cursor++;
			i = i / 2;
		}
		
		System.out.println(subList);
	}
}
