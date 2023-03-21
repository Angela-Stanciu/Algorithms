package Algoritmica;

public class StringImpartitInNFragmente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringNEquals(3);
	}
	
	public static void stringNEquals(int number) {
		String string="aaaabbbbcccc";
		int length=string.length();
		int nParts=length/number;
		if(length%number!=0) {
			System.out.println("Nu se imparte exact.Dati alt numar.");
		}else {
			String[] parti=new String[number];
			for(int i=0;i<number;i++) {
				parti[i]=string.substring(i*nParts,(i+1)*nParts);
				System.out.print(parti[i]+"  ");
			}
		}
	}

}
