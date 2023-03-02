package Algoritmica;

public class NumarPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=111;
		System.out.println("Numarul "+number+" este un palindrom?: "+isNumberPalindrome(number));
	}
	
	public static boolean isNumberPalindrome(int number) {
		int reverse=0, temp=number;
		while(number>0) {
			int rest=number%10;
			reverse=reverse*10+rest;
			number=number/10;
		}
		if(reverse==temp) {
			return true;
		} else {
			return false;
		}
		}
	

}
