package Algoritmica;

public class StarPattern {

	//*
	//**
	//***
	//****
	//*****
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=7;
		printStars(number);
	}
	
	public static void printStars(int number) {
		for(int i=1; i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
