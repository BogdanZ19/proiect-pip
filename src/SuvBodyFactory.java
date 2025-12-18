public class SuvBodyFactory extends CarBodyFactory{
    @Override
    protected CarBody createBody() {
        return new Suv();
    }
}
