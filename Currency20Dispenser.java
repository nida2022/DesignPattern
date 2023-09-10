public class Currency20Dispenser implements Handler{

    Handler next ;


    @Override
    public void handle(Currency c) {


        if(c.getAmount()>= 20){
            int n = c.getAmount()/20;
            int rem  = c.getAmount()%20;

            if(rem > 0 && next != null){
                next.handle(c);
            }
            System.out.println("dispence 20 note " + n);
        }

    }

    @Override
    public Handler setNext(Handler h) {
        next = h;
        return  next;
    }
}
