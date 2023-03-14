package Algoritmica;

public class GasesteALTreileNrCelMaiMare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gasesteNumar();
	}
	
	public static void gasesteNumar() {
		int[] vector = {10,13,20,5,2,9};
		int temporar;
		for(int i=0;i<vector.length;i++) {
			for(int j=i+1;j<vector.length;j++) {
				if(vector[i]>vector[j]) {
					temporar=vector[i];
					vector[i]=vector[j];
					vector[j]=temporar;	
				}
			}
		}
		System.out.print("AL treilea cel mai mare numar este: "+vector[vector.length-3]);
	}

}
