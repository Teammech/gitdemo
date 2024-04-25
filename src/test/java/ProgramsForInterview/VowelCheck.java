package ProgramsForInterview;

public class VowelCheck {

	static String vowel = "aeiou";
	static String s="hello world";
	
	public static void main(String[] args) {
		
		
		for (int i=0; i<=s.length();i++)
		{
			for (int j=0; j<=vowel.length(); i++)
			{
				char s1 = s.charAt(i);
				
				//char v1 = vowel.charAt(j);
				System.out.println(s1);
				//System.out.println(v1);
				
			}
		
		}
	

	}

}
