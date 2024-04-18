

public interface Rider {
    public void mount(String rideableType);

    public void mount(String rideableType, int rideableIndex);

    public void mount(String rideableType, int stableNumber, int horseNumber);

   public void dismount();
}
