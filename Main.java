import java.util.Scanner;

/***************************************************************
 * Filename: CheckLetterShape Created by: Melat Semereab Created on: 10/7/2021
 * Comment: This program reads a single character from the keyboard (uppercase)
 * and outputs information according to the following rules: A, E, F, H, I, K,
 * L, M, N, T, V, W, X, Y, Z - STRAIGHT letter C, O, S - CURVED letter B, D, G,
 * J, P, Q, R, U - MIXTURE letter
 ***************************************************************/
public class Main {
  public static void main(String[] args) {
    // prompt a letter from the end user
    Scanner keyboard = new Scanner(System.in);

    // declaring our variables
    String word;
    char letter;

    // creating our object keyboard to get the input
    System.out.println("Enter a letter: ");
    word = keyboard.nextLine();
    word = word.toUpperCase();// changing our input to capital letter
    // we only need the first character of the word, in case our user might give a
    // word instead of letter
    letter = word.charAt(0);

    // Switch statement to easily control our expression
    switch (letter) {
      case 'A', 'E', 'F', 'H', 'I', 'K', 'L', 'M', 'N', 'T', 'V', 'W', 'X', 'Y', 'Z':
        System.out.println("StraightLetter");
        break;
      case 'C', 'O', 'S':
        System.out.println("curvedLetter");
        break;
      case 'B', 'D', 'G', 'J', 'P', 'Q', 'R', 'U':
        System.out.println("mixtureLetter");
        break;
      default:
        System.out.println("You give wrong charcter");
        break;
    }// switch

  }// main
}// class