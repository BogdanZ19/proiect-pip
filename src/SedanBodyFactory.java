public class SedanBodyFactory extends CarBodyFactory{
    @Override
    protected CarBody createBody() {
        return new Sedan();
    }
}
