import java.util.*;

public class Main {
    public static void main(String[] args) {


        Creator creator=new Creator();
        Alive al=new Alive();
        Runner rob=creator.create(Beings.ROBOT,al);
        System.out.println(rob);
//        rob.say(rob.getName());
        System.out.println("_____________");

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