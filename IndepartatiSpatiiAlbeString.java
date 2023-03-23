package Algoritmica;

public class IndepartatiSpatiiAlbeString {

	//cu regex
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeAllWhiteSpaces();
	}
	
	public static void removeAllWhiteSpaces() {
		String string="This is the string.";
		string=string.replaceAll("\\s", "");
		System.out.println(string);			
	}

}
