public class Creator implements ICreator {

    @Override
    public Runner create(Beings BEING, State state){
        switch (BEING){
            case CAT -> {
                return new Cat(state);
            }
            case ROCK -> {
                return new Rock();
            }
            case HUMAN -> {
                return new Human();
            }
            case ROBOT -> {
                return new Robot(state);
            }
            case ANIMATE -> {
                return new Animate();
            }
            case INANIMATE -> {
                return new Inanimate();
            }
            default -> {
                throw new RuntimeException("nothing");
            }
        }


    }
}
