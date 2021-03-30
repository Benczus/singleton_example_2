package org.example;

public class Consumer {

    Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Product testConsumer(){
        return this.warehouse.popProduct();
    }
}
