public interface Handler {

    public void handle(Currency c);
    public Handler setNext(Handler h);

}
