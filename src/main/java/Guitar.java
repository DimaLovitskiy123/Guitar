import java.util.List;

public class Guitar {

    private List<IGuitarString> strings;

    public Guitar(List<IGuitarString> strings){
        this.strings = strings;
    }

    public void tuneGuitar(){
        for (IGuitarString run : strings){
            run.tune();
        }
    }
}
