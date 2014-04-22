package com.CTCI.Chapter1.ArraysAndStrings;

/*
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?*/
/**
 * The Class StringAllUniqueCharacters.
 */
public class StringAllUniqueCharacters {

	/**
	 * The main method.
	 *
	 * @param args the args
	 */
	public static void main(String[] args) {

		String str = "Java";
		boolean charSet[] = new boolean[256];
		checkUniqueCharactersUsingArray(str);
		boolean isUnique=checkUniqueCharacters(str,charSet);
		System.out.println(" string is "+isUnique);
	}

	/**
	 * Check unique characters.
	 *
	 * @param str the str
	 * @param charSet the char set
	 * @return true, if check unique characters
	 */
	public static boolean checkUniqueCharacters(String str, boolean[] charSet) {

		for (int i = 0; i < str.length(); i++) {

			int charVal = str.charAt(i);
			if (charSet[charVal]) 

				return false;
			else 
				charSet[charVal] = true;
		}
		return true;

	}
	
	/**
	 * Check unique characters using array.
	 *
	 * @param str the str
	 */
	public static void checkUniqueCharactersUsingArray(String str){
		
		int [] arr=new int [256];
		for (int i = 0; i < str.length(); i++) {

			if(arr[str.charAt(i)]>0)
				arr[str.charAt(i)]=arr[str.charAt(i)]+1;
			else
				arr[str.charAt(i)]=arr[str.charAt(i)]+1;
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
			System.out.println(arr[i]+" "+(char)i);//if arr[i] contains value grater than 2, the character is repeated 
		}
	}
	/*1 J
	  2 a
	  1 v
	 * */
}
