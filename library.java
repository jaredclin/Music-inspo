//Public variables

import java.util.Map;
import java.util.HashMap;

public class library {
// Initialize valid keys in the major/minor scales
  public static Map<Integer, String[]> KEY_MAP;
  static {
    KEY_MAP = new HashMap<Integer, String[]>();
    //TODO: figure out how to simplify this, cannot do KEY_MAP.put(0, {"c", "d"...})
    //TODO: finish this chunk
    //KEY_MAP.put(2, {"C", "D", "E", "F", "G", "A", "B"});
    String[] C = {"C", "D", "E", "F", "G", "A", "B"};
    String[] Cm = {"C", "D", "D#", "F", "G", "G#", "A#"};
    String[] Csharp = {"C#", "D#", "F", "F#", "G#", "A#", "C"};
    String[] Csharpm = {"C#", "D#", "E", "F#", "G#", "A", "B"};
    String[] D = {"D", "E", "F#", "G", "A", "B", "C#"};
    String[] Dm = {"D", "E", "F", "G", "A", "A#", "C"};
    String[] Dsharp = {"D#", "F", "G", "G#", "A#", "C", "D"};
    String[] Dsharpm = {"D#", "F", "F#", "G#", "A#", "B", "C#"};
    KEY_MAP.put(0, C);
    KEY_MAP.put(1, Cm);
    KEY_MAP.put(2, Csharp);
    KEY_MAP.put(3, Csharpm);
    KEY_MAP.put(4, D);
    KEY_MAP.put(5, Dm);
    KEY_MAP.put(6, Dsharp);
    KEY_MAP.put(7, Dsharpm);
    /*KEY_MAP.put(8, E);
    KEY_MAP.put(9, Em);
    KEY_MAP.put(10, F);
    KEY_MAP.put(11), Fm);
    KEY_MAP.put(12, Fsharp);
    KEY_MAP.put(13, Fsharpm);
    KEY_MAP.put(14, G);
    KEY_MAP.put(15, Gm);
    KEY_MAP.put(16, Gsharp);
    KEY_MAP.put(17, Gsharpm);
    KEY_MAP.put(18, A);
    KEY_MAP.put(19, Am);
    KEY_MAP.put(20, Asharp);
    KEY_MAP.put(21, Asharpm);
    KEY_MAP.put(22, B);
    KEY_MAP.put(23, Bm);*/
  }
}
