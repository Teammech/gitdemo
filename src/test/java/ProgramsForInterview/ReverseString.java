package ProgramsForInterview;

public class ReverseString {
	
	static String rev="";

	public static void main(String[] args) {
		String S="abc";		
		for(int i=S.length()-1;i>=0;i--)
		{
			
			char t = S.charAt(i);
			 rev = rev + t;
			
		}
		System.out.println(rev);
		
		
		//For github test

	}
	
	

	
}
