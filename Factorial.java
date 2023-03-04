package Algoritmica;

public class Factorial {

	//CALCULUL FACTORIAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numar=5;
		System.out.println("Produsul factorial pentru numarul "+numar+ " este: "+calculFactorial(numar));
	}
	
	public static int calculFactorial(int numar) {
		int produs =1;
		for(int i=1;i<=numar;i++) {
			produs*=i;
		}
		return produs;
	}

}
