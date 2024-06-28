package org.example.utils;

import org.example.entities.Position;
import org.example.entities.Priority;

import java.util.Random;

public class Util {
    public static Random random = new Random();

    public static double distance(Position x, Position y) {
        return Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + Math.pow(x.getY() - y.getY(), 2));
    }

    public static Priority randomPriority() {
        return Priority.values()[random.nextInt(Priority.values().length)];
    }
}
