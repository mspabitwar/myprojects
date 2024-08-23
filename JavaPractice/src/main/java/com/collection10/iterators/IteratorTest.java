package com.collection10.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<>();
		animals.add("tiger");
		animals.add("cockroach");
		animals.add("cat");
		animals.add("dog");
		animals.add("donkey");
		
		Iterator<String> iterator = animals.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
			
			if(value.equals("cat")) {
				iterator.remove();
			}
		}
		
		System.out.println("--------------");
		
		// foreach - modern iteration, Java 5 or later
		for(String animal : animals) {
			System.out.println(animal);
			//animals.remove(0); -- this will throw ConcurrentModificationException
		}

	}
}