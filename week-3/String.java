import java.util.Scanner;

public class UserInputManipulation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String userInput = sc.nextLine();

    UserInputManipulation obj = new UserInputManipulation();

    System.out.println("Original string: " + userInput);
    System.out.println("String in uppercase: " + obj.toUppercase(userInput));
    System.out.println("String in lowercase: " + obj.toLowercase(userInput));
    System.out.println("Reversed string: " + obj.reverseString(userInput));
  }

  public String toUppercase(String str) {
    return str.toUpperCase();
  }

  public String toLowercase(String str) {
    return str.toLowerCase();
  }

  public String reverseString(String str) {
    StringBuilder reversedString = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      reversedString.append(str.charAt(i));
    }
    return reversedString.toString();
  }
}
