package Algoritmica;

public class DouaMatriciSuntEgale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bol=matriciEgale();
		System.out.println("Cele doua matrici sunt egale?: "+bol);
	}
	
	public static boolean matriciEgale() {
		int[][] matriceA= {{5,5,5},{5,5,5}};
		int[][] matriceB= {{5,5,5},{5,5,5}};
		
		int rowsInA=matriceA.length;
		int rowsInB=matriceB.length;
		int columnsInA=matriceA[0].length;
		int columnsInB=matriceB[0].length;
		
		if((rowsInA!=rowsInB) || (columnsInA!=columnsInB)) {
			return false;
		}
		
		for(int i=0;i<rowsInA;i++) {
			for(int j=0;j<columnsInA;j++) {
				if(matriceA[i][j]!=matriceB[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
