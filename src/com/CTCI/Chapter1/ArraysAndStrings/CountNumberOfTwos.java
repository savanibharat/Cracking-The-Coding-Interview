package com.CTCI.Chapter1.ArraysAndStrings;

/**
 * @author Savani Bharat
 * 
 */
public class CountNumberOfTwos {
	static int count = 0;

	public static void main(String[] args) {

		int a = 20;
		for (int i = 0; i <= a; i++) {
			count = countNumber2(i);
		}
		System.out.println(count);
	}

	public static int countNumber2(int num) {

		if (num == 2)
			count++;
		else {

			int a = num % 10;
			if (a == 2)
				count++;

			num = num / 10;
			if (num > 0)
				countNumber2(num);
			else
				return count;
		}
		return count;
	}
}
