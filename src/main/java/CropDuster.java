public class CropDuster extends Aircraft implements FarmVehicle, NoiseMaker, Rideable{

    private boolean isMounted;
    private boolean isBeingFlown;

    public CropDuster(boolean isMounted, boolean isBeingFlown) {
        this.isMounted = isMounted;
        this.isBeingFlown = isBeingFlown;
    }

    public void fertilize(int fieldToFertilize,int cropRowToFertilize, Farm farmOperatingOn) {

    }

    @Override
    public void makeNoise() {

    }

}
