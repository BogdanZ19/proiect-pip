public class BikeFactory extends VehicleFactory{
    @Override
    protected Vehicle createBody() {
        return new Bike();
    }
}
