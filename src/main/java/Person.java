public abstract class Person implements Eater, NoiseMaker{
    public Person(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void eat(String edibleType, int numberToBeEaten){

    }

    @Override
    public void makeNoise(){

    }

}
