package com.CTCI.Chapter11.SortAndStrings;

// TODO: Auto-generated Javadoc
/**
 * The Class BinarySearchInCircularArray.
 *
 * @author Savani Bharat
 */
public class BinarySearchInCircularArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		int arr[] = { 6, 13, 14, 15, 16, 17, 1, 2, 3, 4, 5 };
		int arrySize = arr.length;
		int key = 4;
		binarySearch(arr, arrySize, key);
	}

	public static void binarySearch(int[] a,int arraySize,int key){
		
		int start=0;
		int end=arraySize-1;
		int mid=0;
		int index=-1;
		if(a[start]==key)
			index=start;
		else if(a[end]==key)
			index=end;
		
		while(index==-1 && start!=end-1){
			
			mid=(start+end)/2;
			if(a[mid]==key)
				index=mid;
			else if(a[mid]<a[start]){
				
				if(key>a[mid]&& key < a[end])
					start=mid;
				else
					end=mid;
			}
			else{
				
				if(key<a[mid] && key>a[start])
					end=mid;
				else
					start=mid;
				
			}
		}
		System.out.println(index);
	}
}
