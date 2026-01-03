public class TruckFactory extends VehicleFactory{
    @Override
    protected Vehicle createBody() {
        return new Truck();
    }
}
