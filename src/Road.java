import java.util.Random;

public class Road extends Obstacle{
    Road(){
        Random random=new Random();
        this.length= random.nextInt(100,42000);

    }
    @Override
    public boolean play(Runner runner){
        return runner.run(this.length);
    }
}
