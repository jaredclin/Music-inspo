import java.lang.Math;

public class TextTransform {

  //main method traversing through all stages
  public static void transform(int key, int root, String text) {
    String[] keyNotes = library.KEY_MAP.get(key);
    int[] charValues = textToCharValues(text);
    int[] deltaValues = charValuesToDeltaValues(charValues);
    int[] numeric = deltaValuesToNumeric(root, deltaValues);
    String[] notes = numericToNotes(numeric, keyNotes);
    print(notes);
    return;
  }

  private static int[] textToCharValues(String text) {
    text = text.replaceAll("\\s+","");
    text = text.toLowerCase();
    int[] charValues = new int[text.length()];
    for (int i = 0; i < text.length(); i++) {
      charValues[i] = (int) text.charAt(i);
    }
    return charValues;
  }

  private static int[] charValuesToDeltaValues(int[] charValues) {
    int[] deltaValues = new int[charValues.length];
    deltaValues[0] = 0;
    for (int i = 1; i < charValues.length; i++) {
      deltaValues[i] = (charValues[i] - charValues[i-1]) % 7;
    }
    return deltaValues;
  }

  private static int[] deltaValuesToNumeric(int root, int[] deltaValues) {
    int[] numeric = new int[deltaValues.length];
    numeric[0] = root;
    for (int i = 1; i < deltaValues.length; i++) {
      numeric[i] = numeric[i-1] + deltaValues[i];
    }
    return numeric;
  }

  //refactor if we want to preserve numeric array
  private static String[] numericToNotes(int[] numeric, String[] keyNotes) {
    String[] notes = new String[numeric.length];
    for (int i = 0; i < numeric.length; i++) {
      int octave = (int) Math.floor((double) numeric[i] / 7);
      int num = numeric[i];
        while(num > 6) {
          num = num - 7;
        }
        while(num < 0) {
          num = num + 7;
        }
      notes[i] = keyNotes[num] + "(" + octave + ")";
    }
    return notes;
  }

  private static void print(String[] notes) {
    System.out.println("\n\n");
    for (int i = 0; i < notes.length; i++) {
      System.out.print(notes[i] + "  ");
    }
  }
}
