public class CornStalk extends Crop implements Produce{

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;
    public CornStalk() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    @Override
    public boolean yield(Farm farmOperatingOn) {
        boolean cornHarvested = false;
        for (EarCorn earCorn : farmOperatingOn.getTotalEarCorn()) {
            if (earCorn == null) {
                earCorn = new EarCorn();
                cornHarvested = true;
                break;
            }
        }
        return cornHarvested;
    }
}
