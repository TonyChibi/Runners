
import java.util.List;
import java.util.Random;

public class Filler implements IFiller {
    Random random=new Random();

    Creator creator = new Creator();
    int all=Beings.values().length;
    public void fill(List list, int nums){
        for(int i=0;i<nums;i++){
            int being=i%all;
            if (random.nextInt(0,1)>0) {
                list.add(creator.create(Beings.values()[being], new Dead(random.nextInt(5,20))));

            }else {
                list.add(creator.create(Beings.values()[being], new Alive(random.nextInt(5,20))));

            }
        }
    }
}
