public class CropDuster extends Aircraft implements FarmVehicle, NoiseMaker, Rideable{

    private boolean isMounted;
    private boolean isBeingFlown;

    public CropDuster() {
        this.isMounted = false;
        this.isBeingFlown = false;
    }

    public void fertilize(int fieldToFertilize,int cropRowToFertilize, Farm farmOperatingOn) {

    }

    @Override
    public void makeNoise() {

    }

}
