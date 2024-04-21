public abstract class Crop implements Produce{

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    @Override
    public abstract boolean yield(Farm farmOperatingOn);

}
