public class CornStalk extends Crop implements Produce{

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;
    public CornStalk() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    @Override
    public boolean yield(Farm farmOperatingOn) {

    }
}
