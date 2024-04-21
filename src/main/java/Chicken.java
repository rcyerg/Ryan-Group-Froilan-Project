public class Chicken extends Animal implements Produce{
   
    private boolean hasBeenForFertilized;
    private boolean isFull;
    private int totalNumberOfFoodFed;

    public Chicken(boolean hasBeenForFertilized, boolean isFull, int totalNumberOfFoodFed) {
        this.hasBeenForFertilized = hasBeenForFertilized;
        this.isFull = isFull;
        this.totalNumberOfFoodFed = totalNumberOfFoodFed;
    }

    @Override
    public void eat(String edibleType, int numberToBeEaten) {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public boolean  yield(Farm farmOperatingOn) {

    }
}