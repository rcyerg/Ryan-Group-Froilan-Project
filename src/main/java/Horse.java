public class Horse extends Animal implements Eater, NoiseMaker, Rideable{

    private boolean isFull;
    private int totalNumberOfFoodFed;
    private boolean isMounted;

    public Horse(boolean isFull, int totalNumberOfFoodFed, boolean isMounted) {
        this.isFull = isFull;
        this.totalNumberOfFoodFed = totalNumberOfFoodFed;
        this.isMounted = isMounted;
    }

    @Override
    public void eat(String edibleType, int numberToBeEaten) {
        
    }

    @Override
    public void makeNoise() {
        
    }
}
