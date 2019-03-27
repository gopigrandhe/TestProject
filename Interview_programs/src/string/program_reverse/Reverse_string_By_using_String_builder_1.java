package string.program_reverse;

public class Reverse_string_By_using_String_builder_1 {

	public static void main(String[] args) {
			
		String str= "This is a String";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		
		str2=str2.reverse();
		System.out.println(str2);
	}

}
