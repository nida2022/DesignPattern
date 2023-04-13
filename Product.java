package Composite;

import org.w3c.dom.ls.LSOutput;

public class Product {

    String id;

    int price;

    Product(String id, int price){
        this.id = id;
        this.price = price;
    }

   int  getProductPrice(Product p){
       System.out.println(p.price);
       return p.price;
   }
}
