public class CornStalk extends Crop implements Produce{


    @Override
    public EarCorn yield(Farm farmOperatingOn) {
        return new EarCorn();
    }
}
