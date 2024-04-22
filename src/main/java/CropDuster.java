public class CropDuster extends Aircraft implements FarmVehicle, NoiseMaker, Rideable{

    private boolean isMounted;
    private boolean isBeingFlown;

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setBeingFlown(boolean beingFlown) {
        isBeingFlown = beingFlown;
    }

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
