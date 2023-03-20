package Algoritmica;

public class DiferentaADouaMatrici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		diferentaMatrici();
	}
	
	public static void diferentaMatrici() {
		int[][] matriceA= {{9,9,9},{9,9,9}};
		int[][] matriceB= {{5,5,5},{5,5,5}};
		
		int rowsinA=matriceA.length;
		int columnsinA=matriceA[0].length;
		int[][] rezultat=new int[rowsinA][columnsinA];
		
		for(int i=0;i<rowsinA;i++) {
			for(int j=0;j<columnsinA;j++) {
				rezultat[i][j]=matriceA[i][j]-matriceB[i][j];
				System.out.print(rezultat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
