package Algoritmica;

public class NumarPrim {

	//ESTE SAU NU UN NUMAR PRIM ?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=5;
		System.out.println("Este "+number+" un numar prim?: "+ isPrimeNumber(number));
	}
	
	public static boolean isPrimeNumber(int number) {
		if (number==0)
			return false;
		else if(number==1)
			return false;
		else {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					return false;
				} 
			}
		}
		return true;	
	}

}
