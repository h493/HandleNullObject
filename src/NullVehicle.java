public class NullVehicle implements Vehicle{
    @Override
    public int getSeatingCapacity() {
        return 0; // return the default value
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
