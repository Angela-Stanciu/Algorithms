package Algoritmica;

public class CopiereaElementelorDintrUnVectorInAltul {

	//COPIEREA ELEMENTELOR DINTR-UN VECTOR INTR-ALTUL
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector2=copiereaVector();
		afiseazaVectorul(vector2);
	}
	
	public static int[] copiereaVector() {
		int[] vector1= {1,2,3,4,5,6,7,8,9};
		int[] vector2= new int [vector1.length];
		for(int i=0;i<vector1.length;i++) {
			vector2[i]=vector1[i];
		}
		return vector2;
	}
	
	public static void afiseazaVectorul(int[] vector2) {
		System.out.print("Elementele vectorului sunt: ");
		for(int i=0;i<vector2.length;i++) {
			System.out.print(vector2[i]+" ");
		}
	}

}
