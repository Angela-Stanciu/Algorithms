package Algoritmica;

public class CelMaiMareNumarDinCeleTrei {

	//CARE ESTE CEL MAI MARE NUMAR
	//DIN CELE TREI NUMERE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=6;
		int c=30;
		celMaiMareNumar(a,b,c);
	}
	
	public static void celMaiMareNumar(int a, int b, int c) {
		if((a>=b) && (a>=c)) {
			System.out.println("Cel mai mare numar dintre "+a+", "+b+", "+c+" este: "+a);
		} else if((b>=c)&&(b>=a)) {
			System.out.println("Cel mai mare numar dintre "+a+", "+b+", "+c+" este: "+b);
		} else if((c>=a)&& (c>=b)) {
			System.out.println("Cel mai mare numar dintre "+a+", "+b+", "+c+" este: "+c);
		}
    }
}