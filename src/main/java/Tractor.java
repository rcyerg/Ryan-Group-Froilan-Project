public class Tractor extends Vehicle implements FarmVehicle, NoiseMaker, Rideable{

    private boolean isMounted;

    public Tractor() {
        this.isMounted = false;
    }


    public void harvest(int fieldToHarvest, int cropRowToHarvest, int cropToHarvest, Farm farmOperatingOn) {

    }

    @Override
    public void makeNoise() {

    }

}
