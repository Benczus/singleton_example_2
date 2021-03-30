package org.example;

import java.util.PriorityQueue;

public class Warehouse {
    public final static int Limit= 2000;
    private static final Warehouse instance = new Warehouse(); //Eager instantiation
    private final PriorityQueue<Product> products= new PriorityQueue<>();

    public static Warehouse getInstance() {
    //    if (instance == null)
    //        instance= new Warehouse();   //Lazy instantiation
        return instance;
    }

    private Warehouse() {
    }

    public void storeProduct(Product product){
            this.products.add(product);
    }

    public Product popProduct(){
            return this.products.poll();
    }

    @Override
    public String toString() {
        return  "Number of Products=" + products.size();
    }
}
