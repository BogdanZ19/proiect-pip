public abstract class CarBodyFactory {
    public CarBody create() {
        CarBody body = createBody();
        body.build();
        return body;
    }

    protected abstract CarBody createBody();
}
