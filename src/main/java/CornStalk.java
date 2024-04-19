public class CornStalk extends Crop implements Produce{


    @Override
    public EarCorn yield() {
        return new EarCorn();
    }
}
