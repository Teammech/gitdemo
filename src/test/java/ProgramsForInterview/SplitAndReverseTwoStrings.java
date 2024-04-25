package ProgramsForInterview;

public class SplitAndReverseTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp1 = "";
		String temp2 = "";
		String input="Software Testing";
		String[] first= input.split(" ");
		System.out.println(first.length);
		String w1 = first[0];
				
		for (int i=w1.length()-1;i>=0;i--)
		{
			char t = w1.charAt(i);
			 temp1 = temp1 + t;
			
		}
		System.out.println(temp1);
				
		String w2 = first[1];
		
		for (int i=w2.length()-1;i>=0;i--)
		{
			char t = w2.charAt(i);
			 temp2 = temp2 + t;
			
		}
		System.out.println(temp2);
		
		String rev = temp1+" "+temp2;
		System.out.println(rev);
	}

}
