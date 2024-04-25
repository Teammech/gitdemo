package ProgramsForInterview;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t ="";
		String s1 = "level";
		for (int i = s1.length()-1; i>=0; i--)
		{
			
			//System.out.println(s1.charAt(i));
			 t= t+s1.charAt(i);
			 
			
		}
		
		System.out.println(t);
		if (s1.equals(t))
			{
				
				System.out.println("the text is a polindrome");
		}
		else
		{
			System.out.println("the text is NOT a polindrome");
		}
		

	
	}

}
