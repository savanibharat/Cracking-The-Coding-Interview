package com.CTCI.Chapter1.ArraysAndStrings;

//Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?

/**
 * The Class StringRemoveDups.
 */
public class StringRemoveDups {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the args
	 */
	public static void main(String[] args) {

		// removeDups();
		removeDupsWithExtraSpace();
	}

	/**
	 * Removes the dups.
	 */
	public static void removeDups() {

		String st = "bharat";
		char[] str = st.toCharArray();

		if (str == null)
			return;
		if (str.length < 2)
			return;

		int tail = 1;

		for (int i = 1; i < str.length; i++) {

			int j = 1;
			for (j = 0; j < tail; j++) {

				if (str[i] == str[j])
					break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}

	/**
	 * Removes the dups with extra space.
	 */
	public static void removeDupsWithExtraSpace() {

		String str = "bharataryan";
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {

			if (!newStr.contains(str.charAt(i) + "")) {
				newStr += str.charAt(i);
			}
		}
		System.out.println(newStr);

	}
}
