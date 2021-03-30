package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.storeProduct(new Product(1));
        System.out.println(warehouse);
    }
}
