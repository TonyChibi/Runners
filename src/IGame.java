import java.util.List;

public interface IGame {
   abstract void start(List<Runner> runners);
   abstract void stop(List<Runner> finishers);
}
