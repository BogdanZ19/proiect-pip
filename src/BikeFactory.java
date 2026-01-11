// Concrete creator class
public class BikeFactory extends VehicleFactory{
    @Override
    protected Vehicle createVehicle() {
        return new Bike();
    }
}
