package com.CTCI.Chapter11.SortAndStrings;

public class SearchInSortedArrayAndSpace {

	public static void main(String[] args) {

		String[] strings = { "at", "", "", "", "ball", "", "", "car", "", "",
				"dad", "", "" };
		int index=search(strings, "dad");
		System.out.print(index);

	}

	public static int search(String strings[],String str){
		
		if(strings==null||str==null)
			return -1;
		if(str.equals("")){
			for (int i = 0; i < strings.length; i++) {
				if(strings[i].equals(""))
					return i;
			}
		}
		return search1(strings,str,0,strings.length-1);
	}

	public static int search(String strings[], String str, int first, int last) {

		while (first <= last) {
			//ensure there is something at end so skip all "" from end
			while(first<=last && strings[last].equals("")){
				--last;
			}
			if(last<first){
				return -1;//this block is empty so failed to find
			}
			int mid=(last+first)>>1;
			while(strings[mid].equals("")){
				++mid;//will find one string
			}
			int r=strings[mid].compareTo(str);
			if(r==0)
				return mid;
			if(r<0)
				first=mid+1;
			else
				last=mid-1;
		}
		return -1;
	}
	
	public static int search1(String[] strings,String str,int first,int last){
		
		while(first<=last){
			
			while(first<=last && strings[last].equals(""))
				--last;//let us ensure we encounter something at end
			
			if(last<first)
				return -1;//found only "", nothing else
			
			int mid=(first+last)/2;
			while(strings[mid].equals("")){
				++mid;
			}
			int r=strings[mid].compareTo(str);
			if(r==0)
				return mid;
			if(r<0)
				first=mid+1;
			else
				last=mid-1;
		}
		return -1;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
