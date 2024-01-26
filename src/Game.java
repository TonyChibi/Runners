import java.util.ArrayList;
import java.util.List;

public class Game implements IGame {
    ObstaclesCreator obstCreator=new ObstaclesCreator();
  @Override
    public void start(List<Runner> runners) {
    int count=0;
    int count2=0;
    System.out.println(runners.size());
    ArrayList finishers= new ArrayList<Runner>();
      while(runners.size()>1) {
        count2++;
        Obstacle obst=obstCreator.create();
//        for (Runner runner: runners
//             ) {
//            if (!obst.play(runner)){
//              if(runners.size()<4){
//                finishers.add(runner);
//              }
//              runners.remove(runner);
//            }
//        }
        for (int i= 0; i< runners.size();i++) {
          count++;
          System.out.println(count+"-"+count2+"]  "+obst.getInfo()+" - - "+ runners.get(i).getName());
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
    System.out.println("THE FINISHERS");
    int i=3;
    for(Runner runner: finishers){
      System.out.println(i+" place "+runner.toString() );
      i-=1;
    }
    System.out.println("THE FINISHERS");
  }

}
