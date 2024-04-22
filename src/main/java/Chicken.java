public class Chicken extends Animal implements Produce{
   
    private boolean hasBeenForFertilized;
    private boolean isFull;
    private int totalNumberOfFoodFed;

    public void setFull(boolean full) {
        isFull = full;
    }

    public Chicken() {
        this.hasBeenForFertilized = false;
        this.isFull = false;
        this.totalNumberOfFoodFed = 0;
    }

    @Override
    public void eat(String edibleType, int numberToBeEaten) {
        if (numberToBeEaten + totalNumberOfFoodFed >= 3) {
            this.setFull(true);
        }
        totalNumberOfFoodFed += numberToBeEaten;
        System.out.println("Chicken eats " + numberToBeEaten + " " + edibleType);
    }

    @Override
    public void makeNoise() {
        System.out.println("Buck Cluck!");
    }

    @Override
    public boolean  yield(Farm farmOperatingOn) {

    }
}