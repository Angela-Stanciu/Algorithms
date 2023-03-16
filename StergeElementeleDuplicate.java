package Algoritmica;

import java.util.Arrays;

public class StergeElementeleDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stergeDuplicate();
	}
	
	public static void stergeDuplicate() {
		int[] vector= {1,6,3,4,5,7,6,2,4,3};
		Arrays.sort(vector);
		int j=0;
		for(int i=0;i<vector.length-1;i++) {
			if(vector[i]!=vector[i+1]) {
				vector[j]=vector[i];
				j++;
			}
		}
		vector[j]=vector[vector.length-1];
		for(int i=0;i<=j;i++) {
			System.out.print(vector[i]+" ");
		}
			
		
	}

}
