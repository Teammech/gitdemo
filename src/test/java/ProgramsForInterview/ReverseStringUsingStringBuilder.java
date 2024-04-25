package ProgramsForInterview;

public class ReverseStringUsingStringBuilder {

	  public static String reverse(String str) {
	    StringBuilder sb = new StringBuilder(str);
	    return sb.reverse().toString();
	  }

	  public static void main(String[] args) {
	    String original = "Hello World!";
	    String reversed = reverse(original);
	    System.out.println("Original String: " + original);
	    System.out.println("Reversed String: " + reversed);
	  }
	

}
