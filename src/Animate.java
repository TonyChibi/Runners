public class Animate extends Runner{
    String name;

    State state=new Alive();


    Animate(){
        id+=1;
        this.number=id;

        setLength();
        setHeight();
        this.name=getClass()+" "+number;
        say(name);
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
        return this.name+"\t"+this.totalHeight+"\t"+this.totalLength+"\t"+this.height+"\t"+this.length+"\t number="+number;
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
            say("got"+road);
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
