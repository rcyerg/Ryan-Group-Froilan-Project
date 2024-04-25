public abstract class Aircraft extends Vehicle implements Rideable, NoiseMaker{

    public Aircraft() {
    }

    public void makeNoise() {
        System.out.println("Aircraft Noise!");
    }

}
