import game.Indoor;
import game.Outdoor;

public class TestGame {
    public static void main(String[] args) {
        Indoor i1 = new Indoor();
        Indoor i2 = new Indoor("Amit");
        Outdoor o1 = new Outdoor();
        Outdoor o2 = new Outdoor("Virat");

        i1.display();
        i2.display();
        o1.display();
        o2.display();
    }
}
