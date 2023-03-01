package Algoritmica;

public class FibonacciRecursivitate {

	//FIBONACCI REPREZINTA UN SIR, 
	//IN CARE PRIMELE DOUA CIFRE SUNT 0 SI 1
	//SI RESTUL REPREZINTA SUMA A DOUA NUMERE ANTERIOARE
	//ESTE CU RECURSIVITATE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numar=10;
		for(int i=0;i<numar;i++)
			System.out.print(fibonacci(i)+" ");
	}
	
	public static int fibonacci(int numar) {
		if(numar==0)
			return numar;
		else if(numar==1)
			return numar;
		else return fibonacci(numar-1)+fibonacci(numar-2);
	}

}
