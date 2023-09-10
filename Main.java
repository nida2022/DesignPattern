public class Main {
    public static void main(String[] args) {

        Handler h1 = new Currency50Dispenser();
        Handler h2 = new Currency20Dispenser();

        h1.setNext(h2);
        Currency c = new Currency(2040);
        h1.handle(c);
        System.out.println("Hello world!");
    }
}