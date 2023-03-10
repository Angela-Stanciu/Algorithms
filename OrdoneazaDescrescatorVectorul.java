package Algoritmica;

public class OrdoneazaDescrescatorVectorul {

	//ORDONEAZA IN MOD DESSCRESCATOR 
	//ELEMENTELE UNUI VECTOR
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ordoneazaDescrescator();
	}
	
	public static void ordoneazaDescrescator() {
		int[] vector= {1,3,5,7,8,9};
		int temporar;
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector.length;j++) {
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
