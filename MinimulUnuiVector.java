package Algoritmica;

public class MinimulUnuiVector {

	//AFLAREA CELUI MAI MIC ELEMENT(MINIMUL)
	//AL UNUI VECTOR
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		minimAlVectorului();
	}
	
	public static void minimAlVectorului() {
		int[] vector= {10,15,9,8,5,3,2};
		int minim = vector[0];
		for(int i=0;i<vector.length;i++) {
			if(minim>vector[i]) {
				minim=vector[i];
			}
		}
		System.out.println("Minimul este: "+minim);
	}

}
