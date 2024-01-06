import java.util.Random;

public class ObstaclesCreator {
    Random random= new Random();
    enum Obstacles{
        WALL,
        ROAD
    }
    Obstacle create(){
        switch (Obstacles.values()[random.nextInt(2)]){
            case WALL -> {
                return new Road();
            }
            case ROAD -> {
                return new Wall();
            }
            default -> {
                throw new RuntimeException("Something wrong with Obstacles enum");
            }
        }
    }
}
