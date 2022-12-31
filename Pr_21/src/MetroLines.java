import java.util.List;
import java.util.Arrays;

public class MetroLines {
    private List<String> lines = Arrays.asList("Red", "Green", "Grey", "Blue", "Lime", "Brown");

    public void printList(boolean isEven) {
        for (int i = 0; i < lines.size(); i++) {
            if (isEven) {
                if (i % 2 == 0) {
                    System.out.println(lines.get(i));
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(lines.get(i));
                }
            }
        }
    }
}
