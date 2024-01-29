import java.util.ArrayList;
import java.util.List;

public class Game implements IGame {
    ObstaclesCreator obstCreator=new ObstaclesCreator();
  @Override
    public void start(List<Runner> runners) {

    System.out.println("\n\t\t---START---");
    int count=0;
    ArrayList <Runner> finishers= new ArrayList<Runner>();
      while(runners.size()>1) {
        count++;
        Obstacle obst=obstCreator.create();
        System.out.println("\n\t"+count+" - "+obst.toString()+"]  \t");
        for (int i= 0; i< runners.size();i++) {
          System.out.println(count+"] - - - "+ runners.get(i).getName());
            if (!obst.play(runners.get(i))){
              if(runners.size()<4){
                finishers.add(runners.get(i));
              }
              runners.remove(i);
              i--;
            }
        }
      }
    finishers.add(runners.get(0));
    stop(finishers);
  }
  @Override
    public void stop(List<Runner> finishers){
    System.out.println("\n\tTHE FINISHERS");
    int i=3;
    for(Runner runner: finishers){
      System.out.println(i+" place!!! --> "+runner.toString()+"\n" );
      i-=1;
    }
    System.out.println("\tTHE FINISHERS");
  }

}
