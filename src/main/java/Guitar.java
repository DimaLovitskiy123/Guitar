import java.util.List;

public class Guitar {
    private IGuitarStrings iGuitarStrings;

    private static List<IGuitarStrings> strings;

    public Guitar(List<IGuitarStrings> strings){
        this.strings = strings;
    }

    public static void tuneGuitar(){
        for (IGuitarStrings run : strings){
            GuitarString.tune();
        }
    }
}
