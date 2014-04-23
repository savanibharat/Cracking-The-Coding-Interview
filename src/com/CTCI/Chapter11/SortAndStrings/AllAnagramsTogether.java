package com.CTCI.Chapter11.SortAndStrings;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class AllAnagramsTogether {

	public static void main(String[] args) {
		
		String arr[]={"abc","fgh","xzy","xyz","acb","asdf"};
		sort(arr);
		
	}
	private static void sort(String [] arr) {
		
		Hashtable<String,LinkedList<String>> hash=new Hashtable<String,LinkedList<String>>();
		for (String s : arr) {
			char [] ch=s.toCharArray();
			Arrays.sort(ch);
			String key=ch.toString();
			if(!hash.containsKey(key))
				hash.put(key, new LinkedList<String>());
		
			LinkedList<String> anagrams=hash.get(key);
			anagrams.push(s);
			System.out.println("s is "+s);
		}
		System.out.println(hash);
		/*convert hashtable to array*/
		int index=0;
		
		for (String key : hash.keySet()) {
			
			LinkedList<String> list=hash.get(key);
			for (String t : list) {
				arr[index]=t;
				index++;
				//System.out.println(t);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}