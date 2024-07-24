package org.Kunal.Java_13_LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class LinearSearcInString {
	public static void main(String[] args) {
		String[] str = {"A","B","C","D"};
		String name = "Abhianv";
		char target ='a';
		System.out.println(linearSearch1(name,target));
		System.out.println(Arrays.toString(name.toCharArray()));
		
	}
	
	 static boolean linearSearch1(String str, char target) {
		 if (str.length()==0) {
			 return false;
			
		}
		for (char ch : str.toCharArray()) {
			if (target==ch) {
				return true;
			}
		}
		 
		return false;
		
	}
	
	 static boolean linearSearch(String str, char target) {
		 if (str.length()==0) {
			 return false;
			
		}
		 for (int i = 0; i < str.length() ; i++) {
			if (target==str.charAt(i)) {
				return true;
			}
		}
		 
		return false;
		
	}
	

}
