package com.CTCI.Chapter1.ArraysAndStrings;

//Rotate a string

import java.util.ArrayList;

/**
 * The Class StringRotation.
 */
public class StringRotation {

	/**
	 * The main method.
	 *
	 * @param args the args
	 */
	public static void main(String[] args) {

		String str = "TABLET";
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			strList.add(str.substring(i) + str.substring(0, i));
		}
		System.out.println(strList);
	}
}
/*
 * [TABLET, ABLETT, BLETTA, LETTAB, ETTABL, TTABLE]
 */
