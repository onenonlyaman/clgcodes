package game;

public class Outdoor {
    String player;

    public Outdoor() {
        player = "Rohit";
    }

    public Outdoor(String player) {
        this.player = player;
    }

    public void display() {
        System.out.println("Outdoor Player: " + player);
    }
}
