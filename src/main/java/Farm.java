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

    }

}
