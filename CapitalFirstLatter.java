package com.xworkz;

public class CapitalFirstLatter {
	//making first letter as a capital for given phrase
	 public static String capitalize_letter(String input_string){
	      String first_letter = input_string.substring(0, 1);
	      String remaining_letters = input_string.substring(1, input_string.length());
	      first_letter = first_letter.toUpperCase();
	      input_string = first_letter + remaining_letters;
	      return input_string;
	   }
	
	 //
	 public static String CapitalWord(String str) {
		String[] spiltString=str.split(" "); 
		String word="";
		for(String ch:spiltString) {
			 String first=ch.substring(0,1);  
		        String afterfirst=ch.substring(1);  
		        word+=first.toUpperCase()+afterfirst+" ";  
		}
		return word;		
	 }
	 
	public static void main(String[] args) {
		String str="Hello dear this is the good time to talk";
		System.out.println(CapitalFirstLatter.capitalize_letter(str));
		System.out.println(CapitalFirstLatter.CapitalWord(str));
		int a[]={1,2,3};
		int b[]= {2,4,5};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
	
			}
		}
	}

}
