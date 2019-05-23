class Note {
  int note;
  char pitch;
  int octave;

  public Note (int num) {
    note = num - 97;
    pitch = (char) ((num - 97) % 7 + 65);
    octave = ((num - 92) / 7);
  }

  public void display() {
    System.out.print(this.pitch + "(" + this.octave + ") ");
  }
}
