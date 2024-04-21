public class Horse extends Animal implements Eater, NoiseMaker, Rideable{

    private boolean isFull;
    private int totalNumberOfFoodFed;
    private boolean isMounted;

    public Horse() {
        this.isFull = false;
        this.totalNumberOfFoodFed = 0;
        this.isMounted = false;
    }

    @Override
    public void eat(String edibleType, int numberToBeEaten) {
        
    }

    @Override
    public void makeNoise() {
        
    }
}
