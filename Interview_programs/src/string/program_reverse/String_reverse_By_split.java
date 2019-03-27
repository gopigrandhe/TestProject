package string.program_reverse;

public class String_reverse_By_split {

	public static void main(String[] args) {

		String str = "I am gopi working as a java  Developer";

		String[] token = str.split(" ");
		
		for (int i = token.length - 1; i >= 0; i--) {
		
			System.out.print(token[i] + " ");
			
		}
	}

}
