public abstract class Crop implements Produce{

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    @Override
    public abstract boolean yield(Farm farmOperatingOn);

}
