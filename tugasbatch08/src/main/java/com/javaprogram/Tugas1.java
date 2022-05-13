package com.javaprogram;

import java.util.*;

public class Tugas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> myMember = new TreeMap<>();
		
		myMember.put(42, "Minho");
		myMember.put(12, "Onew");
		myMember.put(11, "Taemin");
		myMember.put(40, "Kibum");	
		
		for (Integer key : myMember.keySet()) {
			System.out.println(myMember.get(key) + "'s id is " + key);
		}
		
		Set<String> myMembers = new TreeSet<>();
		
		myMembers.add("Minho");
		myMembers.add("Onew");
		myMembers.add("Taemin");
		myMembers.add("Kibum");	
		
		for (String item : myMembers) {
			System.out.println(item);
		}
		

	}

}
