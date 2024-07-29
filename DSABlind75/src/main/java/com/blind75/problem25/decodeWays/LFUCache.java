package com.blind75.problem25.decodeWays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Pair {
	int value, frequency;

	public Pair(int value, int frequency) {
		this.value = value;
		this.frequency = frequency;
	}
}

class LFU {
	int cacheSize;
	//Map<Integer, Pair> cache;
	List<Integer> cache;
	PriorityQueue<Pair> priorityQueue;

	public LFU(int cacheSize) {
		this.cacheSize = cacheSize;
		//this.cache = new HashMap<>();
		this.cache = new ArrayList<>();
		this.priorityQueue = new PriorityQueue<>((p1, p2) -> p1.frequency - p2.frequency);
	}

	// method to insert into cache
	public void refer(int value) {
		//if (!cache.containsKey(value)) {
		if (!cache.contains(value)) {
			// insert new element
			insert(value);
		} else {
			// update the frequency of existing element
			update(value);
		}
	}

	private void update(int value) {
		/*if(cache.containsKey(value)) {
			Pair pair = cache.get(value);
			pair.frequency += 1;
			priorityQueue.remove(pair);
			priorityQueue.offer(pair);
		}*/
		Iterator<Pair> iterator = priorityQueue.iterator();
		while(iterator.hasNext()) {
			Pair pair = iterator.next();
			if(pair.value == value) {
				pair.frequency += 1;
			}
		}
	}

	private void insert(int value) {
		if (cache.size() == cacheSize) {
			evictFromCache();
		}
		Pair pair = new Pair(value, 1);
		//cache.put(value, pair);
		cache.add(value);
		priorityQueue.offer(pair);
		System.out.println("Cache block " + value + " inserted.");

	}

	private void evictFromCache() {
		Pair removedPair = priorityQueue.poll();
		//cache.remove(removedPair.value);
		cache.remove(Integer.valueOf(removedPair.value));
		System.out.println("Cache block " + removedPair.value + " removed.");
	}
}

public class LFUCache {
	public static void main(String[] args) {
		LFU lfuCache = new LFU(4);
		lfuCache.refer(1);
		lfuCache.refer(2);
		lfuCache.refer(1);
		lfuCache.refer(3);
		lfuCache.refer(2);
		lfuCache.refer(4);
		lfuCache.refer(5);
		
		System.out.println(lfuCache.cache);
	}
}