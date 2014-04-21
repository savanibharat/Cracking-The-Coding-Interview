package com.CTCI.Chapter1.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MedianAsInputComes {

	static ArrayList<Integer> arrayList=new ArrayList<Integer>();
	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);
		int res;

		int arrLength = Integer.parseInt(in.nextLine());
		int[] a = new int[arrLength];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < arrLength; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			a[_a_i] = _a_item;
		}*/
		int a[]=new int[10];
		Random r=new Random();
		float median=0f;
		for (int i = 0; i < 10; i++) {
			
			a[i]=r.nextInt(10);
			median=checkMedian(a[i]);
			System.out.printf("median is  %.3f", median);
		}
		
		
		
		
	}
	public static float checkMedian(int a){
		
		arrayList.add(a);
		Collections.sort(arrayList);
		System.out.println();
		System.out.println(arrayList);
		if(arrayList.size()==1)
			return a;
		if(arrayList.size()==2)
			if(arrayList.get(0)==arrayList.get(1))
				return (arrayList.get(0)+arrayList.get(1))/2;
		
		if(arrayList.size()==2)
			if(arrayList.get(0)!=arrayList.get(1))
				return (arrayList.get(0)+arrayList.get(1))/2;
		
		
		if(arrayList.size()%2!=0)
			return arrayList.get(arrayList.size()/2);
		
		if(arrayList.size()%2==0){
			
			float mid=arrayList.size()/2;
			float firstValue=arrayList.get((int) mid);
			System.out.println(firstValue);
			float secondValue=arrayList.get((int) (mid-1));
			System.out.println(secondValue);
			return (firstValue+secondValue)/2;
		}
		
		return -1;
	}
}
