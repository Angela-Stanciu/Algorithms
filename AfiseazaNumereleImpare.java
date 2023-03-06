package Algoritmica;

public class AfiseazaNumereleImpare {

	//AFISEAZA NUMERELE IMPARE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=55;
		afiseazaNumereImpare(number);
	}
	
	public static void afiseazaNumereImpare(int number) {
		System.out.print("Numerele impare de la 0 la "+number+" sunt: ");
		for(int i=0;i<=number;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}

}
