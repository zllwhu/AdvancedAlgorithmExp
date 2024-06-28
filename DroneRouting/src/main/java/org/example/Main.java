package org.example;

import org.example.entities.DistributionCenter;
import org.example.entities.Priority;
import org.example.simulations.Init;
import org.example.simulations.OrderList;
import org.example.utils.Util;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Init init = new Init();
        init.loadMap(0);

//        System.out.println(Arrays.toString(init.getDistributionCenters()));
//        System.out.println(Arrays.toString(init.getDischargePoints()));

//        for (int i = 0; i < 20; i++) {
//            System.out.println(Util.randomPriority());
//        }
//        System.out.println(Priority.HIGH);
//        System.out.println(Priority.MEDIUM);
//        System.out.println(Priority.LOW);

        OrderList orderList = new OrderList();
        orderList.newOrders(init.getDischargePoints(), 3, 0);
        System.out.println(orderList.orders);

        System.out.println();
        orderList.orderDistribution(init.getDistributionCenters());
        for (DistributionCenter distributionCenter : init.getDistributionCenters()) {
            System.out.println(distributionCenter.orders);
        }
    }
}
