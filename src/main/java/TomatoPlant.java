public class TomatoPlant extends Crop implements Produce{


    public TomatoPlant(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    @Override
    public boolean yield(Farm farmOperatingOn) {
    }

}
