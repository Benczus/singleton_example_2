package org.example;

public class Producer {

    Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void testProducter(Product product){
        this.warehouse.storeProduct(product);
    }
}
