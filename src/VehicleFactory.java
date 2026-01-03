public abstract class VehicleFactory {
    public Vehicle create() {
        Vehicle body = createBody();
        body.build();
        return body;
    }

    protected abstract Vehicle createBody();
}
