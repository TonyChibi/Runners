import java.util.*;

public class Main {
    public static void main(String[] args) {




        ArrayList<Runner> runners = new ArrayList<Runner>();
        Filler filler = new Filler();
        filler.fill(runners, 12);
        Game game = new Game();
        game.start(runners);

    }

    public static void show(Runner n) {
        System.out.println(n);
    }
}