public class Robot  extends Inanimate{

    @Override
    public boolean run(int road){
        if(this.state instanceof Alive){
            if(this.length-road>0){
                this.totalLength+=road;
                this.length-=road;
                say("whoosh");
                return true;
            }
            else {
                this.totalLength += this.length;
                road-=this.length;
                this.state= new Dead(30);
                setLength();
                say("BOOM!!!");
                return run(road);
            }
        }
        else {
            if(this.length-road>=0){
                this.totalLength+=road;
                this.length-=road;
                return true;
            }
            else {
                this.totalLength+=this.length;
                this.length=0;
                return false;
            }
        }
    }
}