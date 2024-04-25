public abstract class Animal implements Eater, NoiseMaker {

    public Animal() {
    }

    @Override
    public void eat(String edibleType, int numberToBeEaten) {

    }

    @Override
    public void makeNoise() {
        System.out.println("Default animal noise!!");
    }
}