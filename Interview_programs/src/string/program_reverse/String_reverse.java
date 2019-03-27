package string.program_reverse;

public class String_reverse {

	public static void main(String[] args) {

		String str="this is the string";
		
		String reverse="";
		
		int length=str.length();
		
		for(int i=length-1;i>=0;i--) {
			
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
