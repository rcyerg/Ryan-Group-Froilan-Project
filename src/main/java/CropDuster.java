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

    public boolean getIsBeingFlown() {
        return isBeingFlown;
    }

    public CropDuster() {
        this.isMounted = false;
        this.isBeingFlown = false;
    }

    public void fertilize(int fieldToFertilize,int cropRowToFertilize, Farm farmOperatingOn) {
        Crop[] crops = farmOperatingOn.getFields()[fieldToFertilize - 1].getCropRows()[cropRowToFertilize - 1].getCrops();
        int fertilizedCount = 0;
        for (Crop crop : crops) {
            if (crop != null && !crop.getHasBeenFertilized()) {
                crop.setHasBeenFertilized(true);
                fertilizedCount++;
            }
        }
        if (fertilizedCount > 0) {
            System.out.println("Fertilized " + fertilizedCount + " crops in field #" + fieldToFertilize + " at crop row #" + cropRowToFertilize);
        } else {
            System.out.println("No crops to fertilize in field #" + fieldToFertilize + " at crop row #" + cropRowToFertilize);
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("Cock a doodle doooooooo");
    }

}
