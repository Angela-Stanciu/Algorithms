package Algoritmica;

public class DivizoriiUnuiNumar {

	//CATAM DIVIZORII UNUI NUMAR
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=121;
		System.out.print("Divizorii numarului "+number+" sunt: ");
		divizoriiNumarului(number);
	}
	
	public static void divizoriiNumarului(int number) {
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
