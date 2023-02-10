public class Car implements Vehicle{
    @Override
    public int getSeatingCapacity() {
        return 10;
    }

    @Override
    public int getTankCapacity() {
        return 15;
    }
}
