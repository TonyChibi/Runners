public class Animate extends Runner{
    String name;

    State state=new Alive();


    Animate(){
        id+=1;
        this.number=id;

        setLength();
        setHeight();
        this.name=getClass()+" "+number+" "+this.state.getClass();
//        say(name);
    }

    public String getName(){
        return this.name;
    }

    @Override
    protected void setHeight() {
        this.height=state. getHeight();
    }

    @Override
    protected void setLength() {
        this.length= state.getLength();
    }

    @Override
    public String toString() {
        return this.name+"\n\t total height: "+this.totalHeight+"\ttotal Length: "+this.totalLength+"\t number: "+number;
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
    public boolean run(int road){

        if(this.length-road>=0){
            this.totalLength+=road;
            this.length-=road;
            say("got "+road+" meters");
            return true;
        } 
        else {
            this.totalLength += this.length;
            this.length=0;
            say("finished");
            return false;
        }
    }


}
