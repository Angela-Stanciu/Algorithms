package Algoritmica;

public class CMMDC {

	//CEL MAI MARE DIVIZOR COMUN A DOUA NUMERE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b=15;
		cmmdcADouaNumere(a,b);
	}
	
	public static void cmmdcADouaNumere(int a, int b) {
		
		int divizor_comun=1;
		for(int i=1;(i<=a) && (i<=b); i++) {
			if((a%i==0) && (b%i==0)) {
				divizor_comun=i;
			}
		}
		System.out.println("Divizorul comun al numerelor "+a +" si "+ b+", este: "+divizor_comun);
	}

}
