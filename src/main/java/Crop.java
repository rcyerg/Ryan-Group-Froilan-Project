public abstract class Crop implements Produce{

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    @Override
    public abstract Edible yield();

}
