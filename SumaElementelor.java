package Algoritmica;

public class SumaElementelor {

	//AFLAREA SUMEI ELEMENTELOR UNUI VECTOR
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumaElementelor();
	}
	
	public static void sumaElementelor() {
		int[] vector= {1,2,3,4,4,5,6,7};
		int suma=0;
		for(int i=0;i<vector.length;i++) {
			suma+=vector[i];
		}
		System.out.println("Suma elementelor este: "+ suma);
	}
	
	

}
