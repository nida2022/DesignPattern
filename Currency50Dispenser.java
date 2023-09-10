public class Currency50Dispenser implements Handler {

    Handler next ;


    @Override
    public void handle(Currency c) {


        if(c.getAmount()>= 50){
            int n = c.getAmount()/50;
            int rem  = c.getAmount()%50;
            System.out.println("dispence 50 note " + n);
            if((rem > 0) && next != null){
                next.handle(new Currency(rem));
            }


        }

    }

    @Override
    public Handler setNext(Handler h) {
        next = h;
        return  next;
    }
}
