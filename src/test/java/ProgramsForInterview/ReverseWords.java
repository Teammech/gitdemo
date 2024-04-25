package ProgramsForInterview;
public class ReverseWords {

  public static void main(String[] args) {
    String text = "This is a sample text to reverse";
    String[] words = text.split("\\s+");  // Split by whitespace
    
    for (int i = words.length - 1; i >= 0; i--) {
      System.out.print(words[i] + " ");
    }
  }
}