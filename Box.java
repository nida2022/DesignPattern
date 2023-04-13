package Composite;


import java.util.ArrayList;
import java.util.List;

public class Box {

    List<Product> lp ;
    String name ;

    List<Object> lb;
    int price = 0;
        Box(){
        };
    Box(String name){
        this.name = name;
        lb = new ArrayList<>();
    }

    void add(Object o){
        lb.add(o);

    }

    public Box addInBox(){

        int price = 0;
        Box x  = new Box("level1");
        x.add(new Product("1",10));
        x.add(new Product("2",20));

        Box x1 = new Box("level2");


        x1.add( new Product("3",30));
        x1.add(new Product("4",40));
        x.add(x1);

        return x;

    }





}
