package Algoritmica;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=14578;
		System.out.println("Inversul numarului "+number +" este: "+reverseNumber(number));
	}
	
	public static int reverseNumber(int number) {
		int reverse=0;
		while(number>0) {
			int rest=number%10;
			reverse=reverse*10+rest;
			number=number/10;
		}
		return reverse;
		
	}

}
