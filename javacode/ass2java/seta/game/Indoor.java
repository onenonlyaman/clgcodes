package game;

public class Indoor {
    String player;

    public Indoor() {
        player = "Rahul";
    }

    public Indoor(String player) {
        this.player = player;
    }

    public void display() {
        System.out.println("Indoor Player: " + player);
    }
}
