package Algoritmica;

import java.util.Arrays;

public class DouaStringuriSuntAnagrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bol=isAnagram();
		System.out.println("Are those two strings anagram?: "+bol);
		
	}
	
	public static boolean isAnagram() {
		String string1="silent";
		String string2="listen";
		
		if(string1.length()!=string2.length()) {
			return false;
		}
		
		char[] vector1=string1.toCharArray();
		char[] vector2=string2.toCharArray();
		Arrays.sort(vector1);
		Arrays.sort(vector2);
		
		for(int i=0;i<vector1.length;i++) {
			if(vector1[i]!=vector2[i]) {
				return false;
			}
		}
		return true;
	}

}
