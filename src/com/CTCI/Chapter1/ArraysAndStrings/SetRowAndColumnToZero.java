package com.CTCI.Chapter1.ArraysAndStrings;

//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
// TODO: Auto-generated Javadoc
/**
 * The Class SetRowAndColumnToZero.
 */
public class SetRowAndColumnToZero {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the args
	 */
	public static void main(String[] args) {

		int[][] matrix = new int[4][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = i * 2;// setting input to matrix
			}
		}
		matrix[0][0] = 1;
		matrix[0][1] = 1;
		matrix[0][2] = 1;
		matrix[0][3] = 1;
		// matrix of [0][i] will be zero so setting it else program will convert
		// every digit in matrix to 1
		matrix[1][2] = 0;// setting it 0 so as to make that row and column to 1

		matrix[2][1] = 0;// setting it 0 so as to make that row and column to 1

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		setRowAndColumnToZero(matrix);

	}

	/**
	 * Sets the row and column to zero.
	 * 
	 * @param matrix
	 *            the row and column to zero
	 */
	public static void setRowAndColumnToZero(int[][] matrix) {

		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];

		// not to make all elements in array to 1 so we set the bit that we need
		// to make 1 in matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}

		// start the damage in matrix check whether that row OR column has 1
		// if yes make that row AND column to 1
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < column.length; j++) {
				if ((row[i] == 1 || column[j] == 1))
					matrix[i][j] = 1;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}

	}
}
/*
 * 1 1 1 1 2 2 0 2 4 0 4 4 6 6 6 6
 * 
 * 1 1 1 1 1 1 1 1 1 1 1 1 6 1 1 6
 */
