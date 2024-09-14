 package javasessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
       
		// Different collections we have to learn
		//1.array
		//2.araylist
		//3.hashmap
		//4.linkedhashmap
		//5.treemap
		
		
		// Hashmap is a very special collection
		// stores value in the form of key value combination
		//stores with key-value pair
		//HashMap(c) implememts Map(I)
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("tom", "SDET1");// in ArrayList we use "add" method
		empMap.put("peter", "SDET2");
		empMap.put("lisa", "SDET3");
		empMap.put("naveen", "QA");
		empMap.put(null, "QA1");//0
		empMap.put("peter", "SDET4");// have duplicate keys but it is override
		empMap.put(null, "QA2");//0
				
		System.out.println(empMap.get("peter"));// rv.get(key) to access the value // gives SDET4
		System.out.println(empMap.get(null));//QA2
		
		//print all the values from hashap:
		//System.out.println(empMap);
		
		
//	  How to iterate Hashmap --> below is the syntax to iterate hashmap
		// hashmap is the child class of Map interface
		
//		for(Map.Entry element : rv.entrySet()) {// syntax to iterate hashmap
//		System.out.println(element.getKey() + ":" + element.getValue());
//	}
	
		for(Map.Entry element : empMap.entrySet()) {
			System.out.println(element.getKey() + ":" + element.getValue());
		}
		
		// there is shortcut way to print all the values of hashmap
		//jdk1.8: can use lambda:
		empMap.forEach((k,v) -> System.out.println(k+":"+v));
		
		HashMap<Integer, String> numMap = new HashMap<Integer, String>();
		numMap.put(1, "A");
		numMap.put(2, "B");
		
		// for HashMap internal machanism working---last video dekhni padegi
		// <null,"OA4">-- whenever hashmap trying to store null key then index should be given 0
		// hascode will be calculated on the basis of key only
		
	}
}
