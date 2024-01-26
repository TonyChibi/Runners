import java.util.Random;

public class Alive implements State{
Random random= new Random();


    int maxHeight;
    int maxLength;

    Alive(int maxHeight, int maxLength){
        this.maxHeight=maxHeight;
        this.maxLength=maxLength;
    }
    Alive(int maxHeight){
        this(maxHeight,1);
    }
    Alive(){
        this(10,10000);
    }

    @Override
    public int getHeight() {
        return random.nextInt(0,maxHeight);
    }

    @Override
    public int getLength() {
        return (random.nextInt(maxLength)+20000);
    }

}
