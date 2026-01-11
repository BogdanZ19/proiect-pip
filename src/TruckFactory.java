//Concrete creator class
public class TruckFactory extends VehicleFactory{
    @Override
    protected Vehicle createVehicle() {
        return new Truck();
    }
}
