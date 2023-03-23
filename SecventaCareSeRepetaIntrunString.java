package Algoritmica;

public class SecventaCareSeRepetaIntrunString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		longestSequence();
	}
	
	public static void longestSequence() {
		String string="acbdfghybdf";
		String longestString="";
		for(int i=0;i<string.length();i++) {
			for(int j=i+1;j<string.length();j++) {
				String substring=string.substring(i,j);
				if((string.indexOf(substring,j)!=-1) &&
						(substring.length()>longestString.length())) {
					longestString=substring;
				}
			}
		}
		System.out.println("Longest repeating sequence: "+longestString);	
	}
}
