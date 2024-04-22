public class Farmer extends Person implements Pilot, Botanist, Rider{

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
    public void rideHorse(){
        if (this.getCurrentlyMounting() instanceof Horse) {
            System.out.println(this.getName() + " is riding the horse");
        } else {
            System.out.println(this.getName() + " is not riding a horse");
        }
    }


    @Override
    public void plant(String cropType, int fieldToPlantIn, int cropRowToPlantIn) {
        CropRow cropRow = this.getFarm().getFields()[fieldToPlantIn -1].getCropRows()[cropRowToPlantIn -1];

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
    public void eat(String edibleType, int numberToBeEaten){

    }

    @Override
    public void makeNoise(){
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
            System.out.println(this.getName() + " sectioned crop rows in field #" + fieldToSection );
        }
    }

    @Override
    public void fly() {
        if (getCurrentlyMounting() instanceof CropDuster) {
            ((CropDuster)this.getCurrentlyMounting()).setBeingFlown(true);
            System.out.println(this.name + " is flying the crop duster!");
        } else {
            System.out.println(this.name + " is not currently mounted on crop duster.");
        }
    }

    @Override
    public void mount(String rideableType) {

    }

    @Override
    public void mount(int rideableNumber) {

    }

    @Override
    public void mount(String rideableType, int stableNumber, int horseNumber) {

    }

    @Override
    public void dismount() {
        if (this.getCurrentlyMounting() == null) {
            System.out.println(this.getName() + " is not mounting anything.");
        } else {
            if (this.getCurrentlyMounting() instanceof Horse) {
                ((Horse)this.getCurrentlyMounting()).setMounted(false);
                System.out.println(this.getName() + " is dismounting the horse");
            } else if (this.getCurrentlyMounting() instanceof CropDuster) {
                ((CropDuster)this.getCurrentlyMounting()).setMounted(false);
                System.out.println(this.getName() + " is dismounting the crop duster");
            } else {
                ((Tractor)this.getCurrentlyMounting()).setMounted(false);
                System.out.println(this.getName() + " is dismounting the tractor");
            }
        }
    }

    public void buyFarm(){
        if (this.getFarm() == null) {
            this.farm = new Farm();
            System.out.println(this.name + " has purchased a new farm!");
        } else {
            System.out.println(this.name + " already has a farm.");
        }
    }

    public void buyChickens(int numChickenToBuy){

    }

    public void buyHorses(int numHorseToBuy){

    }

    public void buildChickenCoop(int numCoopToBuild){

    }

    public void buildStables(int numStableToBuild){

    }




    public void buyTractor(int numTractorToBuy) {

    }

    public void buyCropDuster(int numDusterToBuy) {

    }

    public void buyFieldPlot(int numFieldToBuy) {

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
    }

    public void cheekCoopForEggs(int coopNumber){
        
    }

}
