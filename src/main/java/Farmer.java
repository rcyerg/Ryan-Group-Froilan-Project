public class Farmer extends Person implements Pilot, Botanist, Rider {

    private String name;
    private Farm farm;
    private Rideable currentlyMounting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public Rideable getCurrentlyMounting() {
        return currentlyMounting;
    }

    public void setCurrentlyMounting(Rideable currentlyMounting) {
        this.currentlyMounting = currentlyMounting;
    }

    public Farmer(String name) {
        this.name = name;
        this.farm = null;
        this.currentlyMounting = null;
    }

    @Override
    public void rideHorse() {
        if (this.getCurrentlyMounting() instanceof Horse) {
            System.out.println(this.getName() + " is riding the horse");
        } else {
            System.out.println(this.getName() + " is not riding a horse");
        }
    }


    @Override
    public void plant(String cropType, int fieldToPlantIn, int cropRowToPlantIn) {
        CropRow cropRow = this.getFarm().getFields()[fieldToPlantIn - 1].getCropRows()[cropRowToPlantIn - 1];

        switch (cropType.toLowerCase()) {
            case "tomato plant":
                if (cropRow == null) {
                    System.out.println("Location not available");
                    break;
                }
                for (Crop crop : cropRow.getCrops()) {
                    crop = new TomatoPlant();
                }
                System.out.println(this.name + " is planting tomato plants at field #" + fieldToPlantIn + " at crop row #" + cropRowToPlantIn);
                break;

            case "corn stalk":
                if (cropRow == null) {
                    System.out.println("Location not available");
                    break;
                }
                for (Crop crop : cropRow.getCrops()) {
                    crop = new CornStalk();
                }
                System.out.println(this.name + " is planting corn stalks at field #" + fieldToPlantIn + " at crop row #" + cropRowToPlantIn);
                break;

            default:
                System.out.println("Invalid crop type");
                break;
        }
    }

    @Override
    public void eat(String edibleType, int numberToBeEaten) {
        // check if it's a proper food type
        switch (edibleType.toLowerCase()) {
            case "corn":
                int totalEarCorn = 0;
                for (EarCorn earCorn : this.getFarm().getTotalEarCorn()) {
                    if (earCorn == null) {
                        totalEarCorn++;
                    }
                }
                if (totalEarCorn >= numberToBeEaten) {
                    int earCornEaten = 0;
                    for (EarCorn earCorn : this.getFarm().getTotalEarCorn()) {
                        if (earCorn != null && earCornEaten <= numberToBeEaten) {
                            earCornEaten++;
                            earCorn = null;
                        }
                    }
                    System.out.println(this.name + " ate " + numberToBeEaten + " corn");
                } else {
                    System.out.println("Not enough food to eat " + numberToBeEaten + " corn");
                } break;

            case "tomato":
                int totalTomato = 0;
                for (Tomato tomato : this.getFarm().getTotalTomato()) {
                    if (tomato == null) {
                        totalTomato++;
                    }
                }
                if (totalTomato >= numberToBeEaten) {
                    int tomatoEaten = 0;
                    for (Tomato tomato : this.getFarm().getTotalTomato()) {
                        if (tomato != null && tomatoEaten <= numberToBeEaten) {
                            tomatoEaten++;
                            tomato = null;
                        }
                    }
                    System.out.println(this.name + " ate " + numberToBeEaten + " tomato");
                } else {
                    System.out.println("Not enough food to eat " + numberToBeEaten + " tomato");
                } break;

            case "egg":
                int totalEggs = 0;
                for (Egg eggs : this.getFarm().getTotalEgg()) {
                    if (eggs == null) {
                        totalEggs++;
                    }
                }
                if (totalEggs >= numberToBeEaten) {
                    int eggsEaten = 0;
                    for (Egg eggs : this.getFarm().getTotalEgg()) {
                        if (eggs != null && eggsEaten <= numberToBeEaten) {
                            eggsEaten++;
                            eggs = null;
                        }
                    }
                    System.out.println(this.name + " ate " + numberToBeEaten + " egg");
                } else {
                    System.out.println("Not enough food to eat " + numberToBeEaten + " egg");
                } break;

            default:
                System.out.println("Invalid food type");
                break;
            }
        }

    @Override
    public void makeNoise() {
        System.out.println("Hello! My name is " + this.name);
    }


    @Override
    public void sectionCropRows(int fieldToSection) {
        Field field = this.getFarm().getFields()[fieldToSection - 1];
        if (field.getCropRows()[0] != null) {
            System.out.println("Field #" + fieldToSection + " is already sectioned");
        } else {
            for (CropRow cropRow : field.getCropRows()) {
                cropRow = new CropRow();
            }
            System.out.println(this.getName() + " sectioned crop rows in field #" + fieldToSection);
        }
    }

    @Override
    public void fly() {
        if (getCurrentlyMounting() instanceof CropDuster) {
            ((CropDuster) this.getCurrentlyMounting()).setBeingFlown(true);
            System.out.println(this.name + " is flying the crop duster!");
        } else {
            System.out.println(this.name + " is not currently mounted on crop duster.");
        }
    }

    @Override
    public void mount(String rideableType) {
        FarmVehicle[] vehicles = this.getFarm().getFarmVehicles();


    }

    @Override
    public void mount(int rideableNumber) {
        int index = rideableNumber -1;
        FarmVehicle[] vehicles = this.getFarm().getFarmVehicles();

        if (index < 0 || index >= vehicles.length) {
            System.out.println("No rideable exists at this number: " + rideableNumber);
        } else {
            FarmVehicle vehicleToMount = vehicles[index];

            if (vehicleToMount instanceof Tractor) {
                if (((Tractor) vehicleToMount).isMounted() == true) {
                    System.out.println("tractor is already mounted");
                } else {
                    this.setCurrentlyMounting((Rideable) vehicleToMount);
                    ((Tractor) vehicleToMount).setMounted(true);
                    System.out.println(this.getName() + " mounts the tractor");
                }
            } else {
                if (((CropDuster) vehicleToMount).isMounted() == true) {
                    System.out.println("Crop duster is already mounted");
                } else {
                    this.setCurrentlyMounting((Rideable) vehicleToMount);
                    ((CropDuster) vehicleToMount).setMounted(true);
                    System.out.println(this.getName() + " mounts the crop duster");
                }

            }
        }
    }

    @Override
    public void mount(int stableNumber, int horseNumber) {

    }

    @Override
    public void dismount() {
        if (this.getCurrentlyMounting() == null) {
            System.out.println(this.getName() + " is not mounting anything.");
        } else {
            if (this.getCurrentlyMounting() instanceof Horse) {
                ((Horse) this.getCurrentlyMounting()).setMounted(false);
                System.out.println(this.getName() + " is dismounting the horse");
            } else if (this.getCurrentlyMounting() instanceof CropDuster) {
                ((CropDuster) this.getCurrentlyMounting()).setMounted(false);
                System.out.println(this.getName() + " is dismounting the crop duster");
            } else {
                ((Tractor) this.getCurrentlyMounting()).setMounted(false);
                System.out.println(this.getName() + " is dismounting the tractor");
            }
        }
    }

    public void buyFarm() {
        if (this.getFarm() == null) {
            this.farm = new Farm();
            System.out.println(this.name + " has purchased a new farm!");
        } else {
            System.out.println(this.name + " already has a farm.");
        }
    }

    public void buyChickens(int numChickenToBuy) {
        int emptySpots = 0;

        for (ChickenCoop coop : this.getFarm().getChickenCoops()) {
            for (Chicken spot : coop.getChickens()) {
                if (spot == null) {
                    emptySpots++;
                }
            }
        }
        if (numChickenToBuy <= emptySpots) {
            int chickensBought = 0;
            for (ChickenCoop coop : this.getFarm().getChickenCoops()) {
                for (Chicken chicken : coop.getChickens()) {
                    if (chicken == null) {
                        chicken = new Chicken();
                        chickensBought++;
                    }
                    if (chickensBought == numChickenToBuy) {
                        break;
                    }
                }
            }
            System.out.println(this.getName() + " bought " + numChickenToBuy + " chickens.");
        } else {
            System.out.println("Not enough space in the farm to buy " + numChickenToBuy + " chickens.");
        }

    }

    public void buyHorses(int numHorseToBuy) {
        int emptySpots = 0;

        for (Stable stable : this.getFarm().getStables()) {
            for (Horse horses : stable.getHorses()) {
                if (horses == null) {
                    emptySpots++;
                }
            }
        }
        if (numHorseToBuy <= emptySpots) {
            int horsesBought = 0;
            for (Stable stable : this.getFarm().getStables()) {
                for (Horse horse : stable.getHorses()) {
                    if (horse == null) {
                        horse = new Horse();
                        horsesBought++;
                    }
                    if (horsesBought == numHorseToBuy) {
                        break;
                    }
                }
            }
            System.out.println(this.getName() + " bought " + numHorseToBuy + " chickens.");
        } else {
            System.out.println("Not enough space in the farm to buy " + numHorseToBuy + " chickens.");
        }
    }

    public void buildChickenCoop(int numCoopToBuild) {
        int openSlots = 0;
        for (ChickenCoop coop : this.getFarm().getChickenCoops()) {
            if (coop == null) {
                openSlots++;
            }
        }
        if (numCoopToBuild <= openSlots) {
            int chickenCoops = 0;
            for (ChickenCoop coop : this.getFarm().getChickenCoops()) {
                if (coop == null) {
                    coop = new ChickenCoop();
                    chickenCoops++;
                }
                if (chickenCoops == numCoopToBuild) {
                    break;
                }
            }
            System.out.println(this.getName() + " built " + numCoopToBuild + " chicken coops.");
        } else {
            System.out.println("Not enough space to build " + numCoopToBuild + " chicken coops.");
        }
    }

    public void buildStables(int numStableToBuild){
        int openSlots = 0;
        for (Stable stable : this.getFarm().getStables()) {
            if (stable == null) {
                openSlots++;
            }
        }
        if (numStableToBuild <= openSlots) {
            int stables = 0;
            for (Stable stable : this.getFarm().getStables()) {
                if (stable == null) {
                    stable = new Stable();
                    stables++;
                }
                if (stables == numStableToBuild) {
                    break;
                }
            }
            System.out.println(this.getName() + " built " + numStableToBuild + " chicken coops.");
        } else {
            System.out.println("Not enough space to build " + numStableToBuild + " chicken coops.");
        }
    }




    public void buyTractor(int numTractorToBuy) {
        int openSlots = 0;
        for (FarmVehicle vehicle : this.getFarm().getFarmVehicles()) {
            if (vehicle == null) {
                openSlots++;
            }
        }
        if (numTractorToBuy <= openSlots) {
            int vehicles = 0;
            for (FarmVehicle vehicle : this.getFarm().getFarmVehicles()) {
                if (vehicle == null) {
                    vehicle = new Tractor();
                    vehicles++;
                }
                if (vehicles == numTractorToBuy) {
                    break;
                }
            }
            System.out.println(this.getName() + " bought " + numTractorToBuy + " tractors.");
        } else {
            System.out.println("Not enough space on the farm to purchase " + numTractorToBuy + " tractors.");
        }
    }

    public void buyCropDuster(int numDusterToBuy) {
        int openSlots = 0;
        for (FarmVehicle vehicle : this.getFarm().getFarmVehicles()) {
            if (vehicle == null) {
                openSlots++;
            }
        }
        if (numDusterToBuy <= openSlots) {
            int vehicles = 0;
            for (FarmVehicle vehicle : this.getFarm().getFarmVehicles()) {
                if (vehicle == null) {
                    vehicle = new CropDuster();
                    vehicles++;
                }
                if (vehicles == numDusterToBuy) {
                    break;
                }
            }
            System.out.println(this.getName() + " bought " + numDusterToBuy + " tractors.");
        } else {
            System.out.println("Not enough space on the farm to purchase " + numDusterToBuy + " tractors.");
        }
    }

    public void buyFieldPlot(int numFieldToBuy) {
        int openSlots = 0;
        for (Field field : this.getFarm().getFields()) {
            if (field == null) {
                openSlots++;
            }
        }
        if (numFieldToBuy <= openSlots) {
            int fields = 0;
            for (Field field : this.getFarm().getFields()) {
                if (field == null) {
                    field = new Field();
                    fields++;
                }
                if (fields == numFieldToBuy) {
                    break;
                }
            }
            System.out.println(this.getName() + " bought " + numFieldToBuy + " tractors.");
        } else {
            System.out.println("Not enough space on the farm to purchase " + numFieldToBuy + " tractors.");
        }
    }

    public void shareFarmOwnership(Farmer newSharedOwner) {
        if (newSharedOwner.getFarm() == null) {
            newSharedOwner.setFarm(this.getFarm());
            System.out.println(newSharedOwner.getName() + " is now a shared owner of " + this.getName() + "'s farm!");
        } else {
            System.out.println(newSharedOwner.getName() + " already owns a farm");
        }
    }

    public void operateTractor(int fieldToHarvest, int cropRowToHarvest, int cropToHarvest, Farm operatingOn){
        if (this.getCurrentlyMounting() instanceof Tractor) {
            System.out.println(this.getName() + " is operating the tractor!");
            Farm farmOperatingOn = this.getFarm();
            ((Tractor) this.getCurrentlyMounting()).harvest(fieldToHarvest, cropRowToHarvest, cropToHarvest, farmOperatingOn);
        } else {
            System.out.println(this.getName() + " is not mounting a tractor");
        }
    }

    public void operateCropDuster(int fieldToFertilize, int cropRowToFertilize, Farm operatingOn){

    }

    public void feed(String animalType, int coopOrStableNumber, int animalNumber, int numberOfFood) {
        Animal animal = null;
        switch (animalType.toLowerCase()) {
            case "horse":
                Stable stable = this.getFarm().getStables()[coopOrStableNumber - 1];
                animal = stable.getHorses()[animalNumber - 1];
                String foodType = "ear corn";

        }
    }

    public void checkCoopForEggs(int coopNumber){
        
    }

}
