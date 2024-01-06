
public class Cat extends Animate {

    Cat(){
        this(new Alive(5,2000));
    }
    Cat(State state){
        this.state=state;
        setLength();
        setHeight();
        this.name=getClass()+" "+number;
        say(name);

    }

//
//    @Override
//    protected void setHeight() {
//        this.height=state.getHeight(this.totalLength, this.boost);
//    }
//
//    @Override
//    protected void setLength() {
//        this.length=state.getLength(boost);
//    }
}
