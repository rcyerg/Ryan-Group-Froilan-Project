public abstract class Crop implements Produce{

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    @Override
    public abstract boolean yield(Farm farmOperatingOn);

}
