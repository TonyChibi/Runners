public class Dead implements State {

    int h=0;
    int angle=45;
    double g=9.80665;
    int length;
    int boost;

    Dead(){
       this(10);
    }
    Dead(int boost){
        this.boost=boost;
        this.length=getLength();
    }

    @Override
    public int getHeight() {
        int V=boost;
        int a=this.angle;
        double x=this.length;
        double t= x/(V*Math.cos(a*Math.PI/180));
        return (int) Math.round( V * Math.sin(a*Math.PI/180) * t - g * t * t / 2);
    }
    @Override
    public int getLength() {
        int V=this.boost;
        int a = this.angle;
//        System.out.println("sin\t"+(Math.sin(2*a*Math.PI/180)*V*V)/g);
        return (int) Math.round((V*V*Math.sin(2*a*Math.PI/180))/g);
    }


}
