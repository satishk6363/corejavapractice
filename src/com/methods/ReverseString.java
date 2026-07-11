package com.methods;

public class ReverseString {
	public static void main(String[] args) {
		String input = "SATISH KUMAR AMMULA";
		  System.out.println("Input String : " + input);
		  
		  ReverseString obj = new ReverseString();
		  String  result   = obj.revstring(input);
		System.out.println("Reversed String : "+ result);
	}
	String revstring (String input) {
	String result = "";
	for(int i = input.length()-1; i>=0; i--) {
		char rev = input.charAt(i);
		result += rev;
		
	}
	return result;
}

}
