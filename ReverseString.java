package Algoritmica;

public class ReverseString {

	//INVERSUL UNUI STRING
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String normal="pisica";
		System.out.println("Inversul string-ului "+normal +" este: "+reverseString(normal));
	}
	
	public static String reverseString(String string) {
		String reverseString="";
		int length=string.length();
		for(int i=length-1;i>=0;i--) {
			reverseString+=string.charAt(i);
		}
		return reverseString;
	}

}
