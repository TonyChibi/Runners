



public class Inanimate extends Runner {
    String name;

    int boost;
    int h;

    Inanimate(int boost, int level, State state){
        this.state=state;
        id+=1;
        this.number=id;
        this.boost=boost;
        this.h=level;
        setHeight();
        setLength();
        this.name=getClass()+" "+number+" "+this.state.getClass();
        say(name);
    }

    Inanimate(int boost, int level){
        this(boost,level,new Dead());
    }

    Inanimate(int boost){
      this(boost,0, new Dead());
//        id+=1;
//        this.boost=boost;
//        setHeight();
//        setLength();
    }
    Inanimate(){
        this(0,0, new Dead());

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

    public String getName(){
        return this.name;
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
