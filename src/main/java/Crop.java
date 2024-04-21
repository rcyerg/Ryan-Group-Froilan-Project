public abstract class Crop implements Produce{

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;
    }

    @Override
    public abstract boolean yield(Farm farmOperatingOn);

}
