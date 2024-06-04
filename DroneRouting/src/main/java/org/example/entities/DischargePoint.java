package org.example.entities;

import java.util.Arrays;
import java.util.Random;

public class DischargePoint {
    Position position;
    Order[] orders;

    public DischargePoint(Position position) {
        this.position = position;
    }

    public DischargePoint(Position position, Order[] orders) {
        this.position = position;
        this.orders = orders;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return position.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof DischargePoint other) {
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
