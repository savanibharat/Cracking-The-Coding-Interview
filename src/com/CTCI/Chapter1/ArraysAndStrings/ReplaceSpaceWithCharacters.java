package com.CTCI.Chapter1.ArraysAndStrings;

// TODO: Auto-generated Javadoc
// Write a method to replace all spaces in a string with ‘%20’

/**
 * The Class ReplaceSpaceWithCharacters.
 *
 * @author Savani Bharat
 */
public class ReplaceSpaceWithCharacters {

	/**
	 * The main method.
	 *
	 * @param args the args
	 */
	public static void main(String[] args) {

		String str="ab  c";
		replaceSpaces(str.toCharArray());
		
		
	}
	
	
	/**
	 * Replace spaces.
	 *
	 * @param ch the ch
	 */
	public static void replaceSpaces(char ch[]){
		
		int space=0;
		int length=ch.length;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]== ' ')
				space++;
		}
		int newLength=ch.length+space*2;

		//ch[newLength]='\0';
		char ch1[]=new char[newLength];
		for (int i = length-1 ; i >=0 ; i--) {
			if(ch[i]==' '){
				ch1[newLength-1]='0';
				ch1[newLength-2]='2';
				ch1[newLength-3]='%';
				newLength-=3;
			}
			else{
				ch1[newLength-1]=ch[i];
				newLength--;
			}
		}
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);
		}
		
	}
}
