public class Farmer extends Person implements Pilot, Botanist, Rider{

    private String name;
    private Farm farm;
    private Rideable currentlyMounting;

    @Override
    public void rideHorse(){

    }


    @Override
    public void plant(String cropType, int fieldToPlantIn, int cropRowToPlantIn) {
    }

    @Override
    public void eat(String edibleType, int numberToBeEaten){
    }

    @Override
    public void makeNoise(){

    }


    @Override
    public void sectionCropRows(int fieldToSection) {

    }

    @Override
    public void fly() {

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

    }

    public void buyFarm(){

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

    }

    public void  operateTractor(int fieldToHarvest, int cropRowToHarvest, int cropToHarvest){

    }

    public void operateCropDuster(int fieldToFertilize, int cropRowToFertilize){

    }

    public void feed(String animalType, int coopOrStableNumber, int animalNumber, int numberOfFood) {
    }

    public void cheekCoopForEggs(int coopNumber){
        
    }

}
