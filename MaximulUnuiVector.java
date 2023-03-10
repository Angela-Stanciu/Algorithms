package Algoritmica;

public class MaximulUnuiVector {

	//AFLAREA CELUI MAI MARE ELEMENT(MAXIM)
	//DINTR-UN VECTOR
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maximElement();
	}
	
	public static void maximElement() {
		int[] vector = {0, 2, 4, 15, 20, 10};
		int maxim = 0;
		for(int i=0;i<vector.length;i++) {
			if(maxim<vector[i]) {
				maxim=vector[i];
			}
		}
		System.out.print("Maximul este: "+ maxim);
	}

}
