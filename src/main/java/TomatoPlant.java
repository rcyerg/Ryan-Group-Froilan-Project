public class TomatoPlant extends Crop implements Produce{

    @Override
    public Tomato yield(Farm farmOperatingOn) {
        return new Tomato();
    }

}
