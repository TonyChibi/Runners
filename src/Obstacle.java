public abstract class Obstacle {
    int height;
    int length;
    abstract boolean play(Runner runner);

    public String getInfo(){
        return getClass()+" l="+length+" h="+height;
    }




}
