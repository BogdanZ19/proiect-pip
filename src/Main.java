public class Main {
    public static void main(String[] args) {
        CarBodyFactory factory = new SedanBodyFactory();
        CarBody body = factory.create();
        
        factory = new SuvBodyFactory();
        body = factory.create();
    }
}
