public class Tractor extends Vehicle implements FarmVehicle, NoiseMaker, Rideable{

    private boolean isMounted;

    public Tractor(boolean isMounted) {
        this.isMounted = isMounted;
    }


    public void harvest(int fieldToHarvest, int cropRowToHarvest, int cropToHarvest, Farm farmOperatingOn) {

    }

    @Override
    public void makeNoise() {

    }

}
