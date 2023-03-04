package Algoritmica;

public class FactorialRecursiv {

	//CALCUL FACTORIAL FOLOSIND RECURSIVITATE
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numar=6;
		System.out.println("Produsul factorial al numarului "+numar+" este: "+calculFactorial(numar));
	}
	
	public static int calculFactorial(int numar) {
		if (numar==0)
			return 1;
		else if(numar==1)
			return 1;
		else 
			return numar* calculFactorial(numar-1);
	}

}
