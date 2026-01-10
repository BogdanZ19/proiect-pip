public abstract class VehicleFactory {
    public Vehicle create() {
        return createVehicle();
    }

    protected abstract Vehicle createVehicle();
}
