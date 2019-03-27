package string.program_reverse;

public class StringReverse_by_converting_into_char {

	public static void main(String[] args) {

		String str = "this is gopi";
		char[] chrs = str.toCharArray();

		for (int i = chrs.length - 1; i >= 0; i--) {
			
			System.out.print(chrs[i]);
			
		}
	}

}
