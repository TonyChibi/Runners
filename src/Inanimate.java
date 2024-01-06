



public class Inanimate extends Runner {
    String name;
    State state=new Dead();
    int boost;
    int h;

    Inanimate(int boost, int level){

        id+=1;
        this.number=id;
        this.boost=boost;
        this.h=level;
        setHeight();
        setLength();
        this.name=getClass()+" "+number;
        say(name);
    }

    Inanimate(int boost){
      this(boost,0);
//        id+=1;
//        this.boost=boost;
//        setHeight();
//        setLength();
    }
    Inanimate(){
        this(0,0);
//        setHeight();
//        setLength();
    }

    @Override
    protected void setHeight() {
        this.height=state.getHeight();
    }

    @Override
    protected void setLength() {
        this.length=state.getLength();
    }

    @Override
    public boolean jump(int wall){
        setHeight();
        if(this.height>wall){
            this.totalHeight+=wall;
            say("hop");
            return true;
        }
        else {
            say("SPLASH!!!");
            return false;
        }
    }

    @Override
    public String toString() {
        return this.totalHeight+"\t"+this.totalLength+"\t"+this.height+"\t"+this.length+"\th="+this.h+"\tboost="+this.boost+"\tnumber="+number;
    }
@Override
    public boolean run(int road){

        if(this.length-road>=0){
            this.length-=road;
            this.totalLength+=road;
            say("got"+road);
            return true;
        }
        else {
            this.totalLength =this.length;
            this.length=0;
            say("finished");
            return false;
        }
    }

}
