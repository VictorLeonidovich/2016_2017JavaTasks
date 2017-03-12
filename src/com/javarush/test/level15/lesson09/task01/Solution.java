package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.25, "A");
        labels.put(1.26, "S");
        labels.put(1.27, "F");
        labels.put(1.28, "G");
        labels.put(1.29, "H");


    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
