import java.util.ArrayList;
import java.util.List;

public class GuitarString implements IGuitarString{

    private int number;
    private Manufacturer manufacturer;

    public GuitarString(int number, Manufacturer manufacturer){
        this.number = number;
        this.manufacturer = manufacturer;
    }

    @Override
    public void tune() {
        System.out.println("настраивается струна " + number);
    }

    @Override
    public void play() {
        System.out.println("играется струна " + number);
    }
}
