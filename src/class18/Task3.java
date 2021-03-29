package class18;

public class Task3 {

	private static String vowelsOnly(String input) { //ovo je nesto novo
		// Create a method that will accept a String as a parameter and return a new
		// String that consist only of vowels. Method should be available inside the class only
		// where it was declared and executed by calling it is name.
		return input.replaceAll("[^a,e,i,o,u]", "");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(vowelsOnly("asghar"));
		
		//break till 1:20
		
		
	}

}
