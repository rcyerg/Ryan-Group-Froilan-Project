public class Farm {

    private Stable[] stables;
    private ChickenCoop[] chickenCoops;
    private FarmHouse farmHouse;
    private Field[] fields;
    private FarmVehicle[] farmVehicles;
    private EarCorn[] totalEarCorn;
    private Tomato[] totalTomato;
    private Egg[] totalEgg;

    public Field[] getFields() {
        return fields;
    }

    public EarCorn[] getTotalEarCorn() {
        return totalEarCorn;
    }

    public Tomato[] getTotalTomato() {
        return totalTomato;
    }

    public Egg[] getTotalEgg() {
        return totalEgg;
    }
    public ChickenCoop[] getChickenCoops() {
        return chickenCoops;
    }

    public Stable[] getStables() {
        return stables;
    }

    public FarmVehicle[] getFarmVehicles() {
        return farmVehicles;
    }

    public Farm() {
        this.stables = new Stable[10];
        this.chickenCoops = new ChickenCoop[10];
        this.farmHouse = new FarmHouse();
        this.fields = new Field[5];
        this.farmVehicles = new FarmVehicle[5];
        this.totalEarCorn = new EarCorn[500];
        this.totalTomato = new Tomato[500];
        this.totalEgg = new Egg[100];
    }

    public void updateFarmStatus() {
        //Iterate through each field on the farm
        for (Field field : this.fields) {
            if (field != null) { //check if the field is null
                //Iterate through each crop row in the field
                for (CropRow cropRow : field.getCropRows()) {
                    if (cropRow != null) { //Check if the crop row is not null
                        //Iterate through each crop in the crop row
                        for (Crop crop : cropRow.getCrops()) {
                            if (crop != null) { // check if the crop is not null
                                crop.setHasBeenHarvested(false); //reset the harvest status to false
                            }
                        }
                    }
                }
            }
        }
        // Iterate through each coop on the farm
        for (ChickenCoop coop : this.chickenCoops) {
            if (coop != null) { // Check if the coop is not null
                // Iterate through each chicken in the coop
                for (Chicken chicken : coop.getChickens()) {
                    if (chicken != null) { // Check if the chicken is not null
                        // Flip the fertilized status
                        boolean currentStatus = chicken.getHasBeenFertilized();
                        chicken.setHasBeenFertilized(!currentStatus);
                        // Set the setFull status to false
                        chicken.setFull(false);
                    }
                }
            }
        }
        // Iterate through each stable on the farm
        for (Stable stable : this.stables) {
            if (stable != null) { // Check if the stable is not null
                // Iterate through each horse in the stable
                for (Horse horse : stable.getHorses()) {
                    if (horse != null) { // Check if the horse is not null
                        horse.setFull(false); // Set setFull to false
                    }
                }
            }
        }
    }

}
