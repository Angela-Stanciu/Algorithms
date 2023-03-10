package Algoritmica;

public class OrdoneazaCrescatorVectorul {

	//ORDONEAZA IN MOD CRESCATOR
	//ELEMENTELE VECTORULUI
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ordoneazaCrescator();
	}
	
	public static void ordoneazaCrescator() {
		int[] vector= {3,1,2,7,9,8,6};
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
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
	}
	

}
