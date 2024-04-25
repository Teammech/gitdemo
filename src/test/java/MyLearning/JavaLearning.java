package MyLearning;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class JavaLearning {

	public static void main(String[] args) {

		//To check if the string contains specific text
		String str = "$100";
		boolean s = str.contains("$");
		
		//===================================================
		//Check whether the text is palindrome or not
		String t ="";
		System.out.println(s);
		
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
