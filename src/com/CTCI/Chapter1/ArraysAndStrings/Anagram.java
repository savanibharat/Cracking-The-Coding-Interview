package com.CTCI.Chapter1.ArraysAndStrings;

// TODO: Auto-generated Javadoc
/**
 * The Class Anagram.
 *
 * @author Savani Bharat
 */
public class Anagram {

	/**
	 * The main method.
	 *
	 * @param args the args
	 */
	public static void main(String[] args) {
		
		//anagramByCharacterArray();
		anagramByString();
	}
	
	/**
	 * Anagram by string.
	 */
	public static void anagramByString(){
		
		String str1="bharat";
		String str2="";
		int sum1=0;
		int sum2=0;
		if(str1.length()==str2.length()){
			//char ch1[]=str1.toCharArray();
			//char ch2[]=str2.toCharArray();
			for(int i=0;i<str1.length();i++){
				/*sum1+=ch1[i];
				sum2+=ch2[i];*/
				sum1+=str1.charAt(i);
				sum2+=str2.charAt(i);
				
			}
			if(sum1==sum2)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
			
		}
		else
			System.out.println("length are not same so definatly not anagram");
		
	}
	
	
	/**
	 * Anagram by character array.
	 */
	public static void anagramByCharacterArray(){
		
		char ch1[]={'a','b','c'};
		char ch2[]={'a','b','C','b'};
		int sum1=0;
		int sum2=0;
		if(ch1.length==ch2.length){
			
			for (int i = 0; i < ch2.length; i++) {
				sum1+=ch2[i];
				sum2+=ch1[i];
			}
			if(sum1==sum2)
				System.out.println("anagram");
			else
				System.out.println("no anagram");
		}
		else{
			System.out.println("no anagram no length same");
		}
		
	}
}
