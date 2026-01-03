public class CarFactory extends VehicleFactory{
    @Override
    protected Vehicle createBody() {
        return new Car();
    }
}
