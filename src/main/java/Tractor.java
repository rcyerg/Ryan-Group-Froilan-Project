public class Tractor extends Vehicle implements FarmVehicle, NoiseMaker, Rideable{

    private boolean isMounted;

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    public Tractor() {
        this.isMounted = false;
    }


    public void harvest(int fieldToHarvest, int cropRowToHarvest, int cropToHarvest, Farm farmOperatingOn) {
        Crop crop = farmOperatingOn.getFields()[fieldToHarvest - 1].getCropRows()[cropRowToHarvest - 1].getCrops()[cropToHarvest - 1];

        int switchVariable = 0;
        if (crop != null) {
            switchVariable = 1;
        }

        switch (switchVariable) {
            case 0:
                System.out.println("No crop found at the specific location");
                break;
            case 1:
                if (crop.getHasBeenFertilized() && !crop.getHasBeenHarvested()) {
                    boolean successfulYield = crop.yield(farmOperatingOn);
                    if (!successfulYield) {
                        switchVariable = 0;
                    }
                    switch (switchVariable) {
                        case 0:
                            System.out.println("Unable to harvest crop #" + cropToHarvest + " because storage is full.");
                            break;
                        case 1:
                            crop.setHasBeenFertilized(false);
                            crop.setHasBeenHarvested(true);
                            String cropType;
                            if (crop instanceof TomatoPlant) {
                                cropType = "tomato";
                            } else {
                                cropType = "ear corn";
                            }
                            System.out.println("Harvested " + cropType + " crop #" + cropToHarvest + " in crop row #" + cropRowToHarvest + " in field #" + fieldToHarvest);
                            break;
                    }
                } else {
                    System.out.println("Unable to harvest crop #" + cropToHarvest + " because it is either not fertilized or already harvested");
                }
        }
    }



    @Override
    public void makeNoise() {
        System.out.println("Beep Beep!!");
    }
}
