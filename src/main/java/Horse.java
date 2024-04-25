public class Horse extends Animal implements Eater, NoiseMaker, Rideable{

    private boolean isFull;
    private int totalNumberOfFoodFed;
    private boolean isMounted;

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    public Horse() {
        this.isFull = false;
        this.totalNumberOfFoodFed = 0;
        this.isMounted = false;
    }

    @Override
    public void eat(String edibleType, int numberToBeEaten) {
        if(!edibleType.equalsIgnoreCase("corn")) {
            System.out.println(edibleType.toLowerCase() + " is not valid");
        } else if (numberToBeEaten + totalNumberOfFoodFed >= 3) {
            this.setFull(true);
        }
        totalNumberOfFoodFed += numberToBeEaten;
        System.out.println("Horse eats " + numberToBeEaten + " " + edibleType.toLowerCase());
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh Neigh!!");
    }
}
