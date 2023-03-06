package Algoritmica;

public class AfiseazaNumerelePare {

	//AFISAREA DE NUMERE PARE 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=100;
		afiseazaNumerePare(number);
	}
	
	public static void afiseazaNumerePare(int number) {
		System.out.print("Numerele pare de la 0 pana la "+number+" sunt: ");
		for(int i=0;i<=number;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
