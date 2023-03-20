package Algoritmica;

public class InmultireaADouaMatrici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inmultireMatrici();
	}
	
	public static void inmultireMatrici() {
		int[][] matriceA= {{1,1,1},{2,2,2},{3,3,3}};
		int[][] matriceB= {{1,1,1},{2,2,2},{3,3,3}};
		
		int rowsInA=matriceA.length;
		int columnsInB=matriceB[0].length;
		int columnsInA=matriceA[0].length;
		
		int[][] rezultat=new int[rowsInA][columnsInB];
		for(int i=0;i<rowsInA;i++) {
			for(int j=0;j<columnsInB;j++) {
				for(int k=0;k<columnsInA;k++) {
					rezultat[i][j]=rezultat[i][j]+matriceA[i][k]*matriceB[k][j];
					
				}
				System.out.print(rezultat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
