package Algoritmica;

public class InversulVectorului {

	//AFISAREA ELEMENTELOR INVERS DECAT CEL NORMAL AL UNUI VECTOR
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		afiseazaInversulElementelor();
	}
	
	public static void afiseazaInversulElementelor() {
		int[] vector= {1,2,3,4,5,6,7,8,7};
		for(int i=vector.length-1;i>=0;i--) {
			System.out.print(vector[i]+" ");
		}
	}

}
