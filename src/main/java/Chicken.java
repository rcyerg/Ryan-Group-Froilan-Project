public class Chicken extends Animal implements Produce{
   
    private boolean hasBeenForFertilized;
    private boolean isFull;
    private int totalNumberOfFoodFed;

    public Chicken() {
        this.hasBeenForFertilized = false;
        this.isFull = false;
        this.totalNumberOfFoodFed = 0;
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