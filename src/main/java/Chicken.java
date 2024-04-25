public class Chicken extends Animal implements Produce{
   
    private boolean hasBeenFertilized;
    private boolean isFull;
    private int totalNumberOfFoodFed;

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Chicken() {
        this.hasBeenFertilized = false;
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
    public boolean yield(Farm farmOperatingOn) {

    }
}