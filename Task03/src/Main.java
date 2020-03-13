import javax.imageio.IIOException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] catArray = {"Vaska", "Murka", "Tajga", "Murzik", "Barsik", "Sima", "Samson", "Spot", "Jim", "Troyka"};
        ArrayList<String> cats = new ArrayList<>();
        for (String s: catArray) {
            cats.add(s);
        }
        CatHotel catHotel = new CatHotel(cats);
        catHotel.runHotel();
    }
}
