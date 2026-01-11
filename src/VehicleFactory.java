// Abstract creator class
// Abstractizeaza procesul de instantiere al vehiculelor
 
public abstract class VehicleFactory {
    public Vehicle create() {
        return createVehicle();
    }

    protected abstract Vehicle createVehicle();
}
