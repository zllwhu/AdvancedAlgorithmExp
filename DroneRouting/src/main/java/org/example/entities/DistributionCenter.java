package org.example.entities;

import java.util.ArrayList;
import java.util.Random;

public class DistributionCenter {
    Position position;
    public ArrayList<Order> orders;

    public DistributionCenter(Position position, ArrayList<Order> orders) {
        this.position = position;
        this.orders = orders;
    }

    public DistributionCenter(Position position) {
        this.position = position;
        this.orders = new ArrayList<>();
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return position.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof DistributionCenter other) {
            return this.position.equals(other.position);
        }
        return false;
    }

    @Override
    public int hashCode() {
        try {
            return position.hashCode();
        } catch (Exception e) {
            Random random = new Random();
            return random.nextInt(100);
        }
    }
}
