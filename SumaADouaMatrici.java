package Algoritmica;

public class SumaADouaMatrici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumaMatrici();
	}
	
	public static void sumaMatrici() {
		int rows=3; 
		int columns=3;
		int[][] matrice1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrice2= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] rezultat=new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				rezultat[i][j]=matrice1[i][j]+matrice2[i][j];
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(rezultat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
