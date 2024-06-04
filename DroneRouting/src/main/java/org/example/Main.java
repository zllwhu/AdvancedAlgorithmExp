package org.example;

import org.example.simulations.Init;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Init init = new Init();
        init.loadMap(1);
        System.out.println(Arrays.toString(init.getDistributionCenters()));
        System.out.println(Arrays.toString(init.getDischargePoints()));
    }
}
