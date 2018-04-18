package com.patrickpu.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.patrickpu.test.algorithm.SubSetGenerator;
import com.patrickpu.test.anonymousClass.Car;
import com.patrickpu.test.functionalInterface.Executor;
import com.patrickpu.test.functionalInterface.Runner;
import com.patrickpu.test.functionalInterface.Student;
import com.patrickpu.test.functionalInterface.Tranformer;
import com.patrickpu.test.generics.MyNode;
import com.patrickpu.test.generics.Node;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		testRunner();
	}
	
	private static void testRunner() {
		Runner runner = new Runner(5);
		
		runner.run();
	}
	
	private static void objectAccessStatic() {
		Uphabit up = new Uphabit();
		System.out.println(Uphabit.i);
		System.out.println(up.i);
	}
	
	private static void testSubSet() {
		new SubSetGenerator().startPrint();
	}

	private static void testFunctionalInterface() {
		Executor<Student> e = new Executor<Student>();
		Student student = new Student();
        
        e.execute(student, new Tranformer<Student>(){
            @Override
            public Student transform(Student student){
                student.setValidated(true);
                return student;
            }
        });
        
        System.out.println(student);
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
	
	private static void testDeque() {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("a");
		ad.add("b");
		ad.add("c");
		
		for (int i=0; i<3; i++) {
			System.out.println(ad.removeFirst());
		}
	}
	
	private static void testLinkedList() {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("a");
		ll.add("b");
		ll.add("c");
		
		
		for (int i=0; i<3; i++) {
			System.out.println(ll.removeLast());
		}
	}

}
