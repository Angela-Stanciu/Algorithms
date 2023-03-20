package Algoritmica;

public class NumarulDeCaractereDintrUnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numarDeCaractere();
	}
	
	public static void numarDeCaractere() {
		String string="Numarul de Caractere";
		int count=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Total: "+count);
	}

}
