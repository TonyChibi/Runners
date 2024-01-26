public abstract class Runner {
    static int id = 0;
    int number;
    int length;
    int height;
    int totalLength;
    int totalHeight;
    State state;

    void say(String str){
        System.out.println(str);

    }
    abstract String getName();
    protected abstract void setHeight();

    protected abstract void setLength();

    public abstract boolean run(int road);

    public abstract boolean jump(int wall);


}
