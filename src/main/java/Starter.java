import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(getStrings(Manufacturer.DADDARIO, 6));

        guitar.tuneGuitar();

    }

    private static List<IGuitarString> getStrings(Manufacturer manufacturer, int numberOfStrings) {
        List<IGuitarString> result = new ArrayList(numberOfStrings);
        for (int r = 0; r < result.size(); r++) {
            result.add(new GuitarString(r + 1, manufacturer));
        }
        return result;
    }
}
