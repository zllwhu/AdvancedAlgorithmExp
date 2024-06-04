package org.example.entities;

public class Order {
    double priority;

    public Order(double priority) {
        this.priority = priority;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Order{" +
                "priority=" + priority +
                '}';
    }
}
