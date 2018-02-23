package com.patrickpu.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.patrickpu.test.anonymousClass.Car;
import com.patrickpu.test.generics.MyNode;
import com.patrickpu.test.generics.Node;
import com.patrickpu.test.interfs.BaseImpl.InnerBase;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {


		
	}
	
	private static void testComparable() {
		
		Comparator<Car> comparator = (Car c1, Car c2) -> c1.getYear() - c2.getYear();
		
		List<Car> list = new ArrayList<Car>() {{
			add(new Car("pat", 2010));
			add(new Car("pat", 2000));
			add(new Car("pat", 2015));
		}};
		
//		list.sort(comparator);
		
		System.out.println(list);
		
		list.stream().sorted().forEach(System.out::println);
		
	}
	
	private static void testStream() {
		List<Integer> list = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
		}};
		
		int sum = list.stream().filter(i -> i%2 != 0)
				.mapToInt(i -> i*2).sum();
		
		System.out.println(sum);
	}
	
	private static void testGenerics() {
		MyNode mn = new MyNode(5);
		Node n = mn;
		n.setData("Hello");
		Integer x = mn.data;
	}

	private static void testAnonymousClass() {

		Car car1 = new Car();
		car1.start();
		
		Car car2 = new Car() {
			@Override
			public void start() {
				System.out.println("Starting quickly");
			}
		};
		
		car2.start();
		
	}
	
	private static void testScope() {

		Car car1 = new Car("Honda", 2014);
		
		System.out.println(car1.model);
		//System.out.println(car1.year);
	}

}
