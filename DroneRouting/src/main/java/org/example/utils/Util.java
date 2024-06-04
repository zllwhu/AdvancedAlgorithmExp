package org.example.utils;

import org.example.entities.Position;

public class Util {
    public static double distance(Position x, Position y) {
        return Math.sqrt(Math.pow(x.getX() - y.getX(), 2) + Math.pow(x.getY() - y.getY(), 2));
    }
}
