public class TomatoPlant extends Crop implements Produce{

    @Override
    public Tomato yield() {
        return new Tomato();
    }

}
