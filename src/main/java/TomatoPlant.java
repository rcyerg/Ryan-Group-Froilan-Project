public class TomatoPlant extends Crop implements Produce{

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public TomatoPlant() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    @Override
    public boolean yield(Farm farmOperatingOn) {
        boolean tomatoHarvested = false;
        for (Tomato tomato : farmOperatingOn.getTotalTomato()) {
            if (tomato == null) {
                tomato = new Tomato();
                tomatoHarvested = true;
                break;
            }
        }
        return tomatoHarvested;
    }

}
