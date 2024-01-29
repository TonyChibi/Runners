import java.util.Random;

public class Wall extends Obstacle {

    Wall(){
        Random random = new Random();
        this.height= random.nextInt(2);
    }
    @Override
    public boolean play(Runner runner){
        return runner.jump(this.height);
    }

    @Override
    public String toString(){
        return "Wall "+ this.height+" - height";
    }

}
