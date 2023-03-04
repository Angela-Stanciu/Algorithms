package Algoritmica;

public class StringPalindrom {

	//PALINDROM - STRING
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String normal="acasa";
		System.out.println("Este string-ul "+normal+" un palindrom?: "+isPalindrom(normal));
	}
	
	public static boolean isPalindrom(String string) {
		String reverseString="";
		String temp=string;
		int length = string.length();
		for(int i=length-1;i>=0;i--) {
			reverseString+=string.charAt(i);
		}
		if(reverseString.equals(temp)) {
			return true;
		} else {
			return false;
		}
	}

}
