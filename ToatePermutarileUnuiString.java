package Algoritmica;

public class ToatePermutarileUnuiString {

	//FOLOSIND RECURSIVITATEA
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="abcd";
		String prefix="";
		findPermutations(string,prefix);
	}
	
	public static void findPermutations(String string, String prefix) {
		
		int length=string.length();
		if(length==0) {
			System.out.println(prefix);
		}else {
			for(int i=0;i<length;i++) {
				findPermutations(string.substring(0, i)+
				string.substring(i+1),prefix+string.charAt(i));
			}
		}
	}

}
