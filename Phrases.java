import java.util.Scanner;

public class Phrases {
  public static void main (String [] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a phrase: ");
    String phrase = kb.nextLine();
    phrase = phrase.toLowerCase();
    Note [] numeric = new Note[phrase.length()];
    for (int i = 0; i<phrase.length(); i++) {
      char c = phrase.charAt(i);
      if (c == ' ') {
        System.out.println();
        continue;
      }
      Note n = new Note((int) c);
      numeric[i] = n;
      numeric[i].display();
    }
  }
}
