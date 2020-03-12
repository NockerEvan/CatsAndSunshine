import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] catFood = {"Kibble", "Champion", "Whiskas", "Pollo"};
        CatFeeder feeder = new CatFeeder(catFood);
        feeder.runCatFeeder();
    }
}
