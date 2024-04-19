public class Chicken extends Animal implements Produce{
    private boolean hasBeenForFertilized;

    public Chicken(boolean hasBeenForFertilized){
        this.hasBeenForFertilized = hasBeenForFertilized;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public Edible yield() {
        return null;
    }
}
