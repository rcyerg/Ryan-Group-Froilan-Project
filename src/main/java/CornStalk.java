public class CornStalk extends Crop implements Produce{

    public CornStalk(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    @Override
    public boolean yield(Farm farmOperatingOn) {

    }
}
