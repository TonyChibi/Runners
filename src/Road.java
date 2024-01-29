import java.util.Random;

public class Road extends Obstacle{
    Road(){
        Random random=new Random();
        this.length= random.nextInt(100,2000);

    }
    @Override
    public boolean play(Runner runner){
        return runner.run(this.length);
    }
    @Override
    public String toString(){
        return "Road "+this.length+" - length";
    }

}
