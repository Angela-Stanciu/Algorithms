package Algoritmica;

public class NumarulDeVocaleSiConsoaneDintrUnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numaruldeVsiCdinString();
	}
	
	public static void numaruldeVsiCdinString() {
		String string="Numarul total de consoane si vocale dintr-un string.";
		string=string.toLowerCase();
		int vocale=0;
		int consoane=0;
		for(int i=0;i<string.length();i++) {
			char litera=string.charAt(i);
			if((litera=='a') || (litera=='e') || (litera=='i') || (litera=='o')
					||(litera=='u')){	
				vocale++;
			}else if((litera>='a') && (litera<='z')) {
				consoane++;
			}
		}
		System.out.println("Numarul total de consoane: "+consoane);
		System.out.println("Numarul total de vocale: "+vocale);
	}

}
