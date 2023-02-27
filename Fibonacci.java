package Algoritmica;

public class Fibonacci {

	//SERIA FIBONACCI
	//PRIMELE DOUA NUMERE SUNT 0 SI 1
	//RESTUL ESTE REPREZENTAT DE SUMA CELOR DOUA NUMERE ANTERIOARE
	//EXEMPLU: 0 1 1 2 3 5 8 13 21 34
	//SIRUL ESTE FACUT FARA RECURSIVITATE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonacci(10);
		
	}
	
	public static void fibonacci(int numar) {
		int[] vector =new int[numar];
		vector[0]=0;
		vector[1]=1;
		System.out.print(vector[0]+" "+vector[1]+" ");
		for(int i=2;i<numar;i++) {
			vector[i]=vector[i-1]+vector[i-2];
			System.out.print(vector[i]+" ");
		}
	}
	

}
