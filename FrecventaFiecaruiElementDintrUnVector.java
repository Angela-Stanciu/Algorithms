package Algoritmica;

public class FrecventaFiecaruiElementDintrUnVector {

	//AFISAREA NUMARULUI (FRECVENTA) FIECARUI ELEMENT
	//DINTR-UN VECTOR
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		frecventaElementelor();
		
	}
	
	public static void frecventaElementelor() {
		int[] vector= {3,2,1,4,3,2,5,7,4,6,7,2,3};
		int[] frecventa=new int[vector.length];
		int visited=-1;
		for(int i=0;i<vector.length;i++) {
			int count=1;
			for(int j=i+1;j<vector.length;j++) {
				if(vector[i]==vector[j]) {
					count++;
					frecventa[j]=visited;
				}
			}
			if(frecventa[i]!=visited) {
				frecventa[i]=count;
			}
		}
		for(int i=0;i<frecventa.length;i++) {
			if (frecventa[i]!=visited) {
				System.out.println(vector[i]+" apare de "+frecventa[i]+" ori");
			}
		}
	}
	
	

}
