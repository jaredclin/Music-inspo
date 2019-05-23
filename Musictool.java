//Command line version
//TODO: GUI

import java.util.Scanner;

public class Musictool {

  public static void main (String [] args) {
    TextTransform tt = new TextTransform();
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the key: ");
    int key = Integer.parseInt(keyboard.nextLine());
    System.out.println("\nEnter the root note: ");
    int root = Integer.parseInt(keyboard.nextLine());
    System.out.println("\nEnter your text: ");
    String text = keyboard.nextLine();
    tt.transform(key, root, text);
  }
}
