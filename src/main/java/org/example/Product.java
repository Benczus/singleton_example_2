package org.example;

public class Product implements Comparable {
    private final int id;

    public int getId() {
        return id;
    }

    public Product(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
