package com.javarush.test.level14.lesson08.home01;

import java.util.Random;

/**
 * Created by Victor on 29.12.2016.
 */
public class SuspensionBridge implements Bridge{

    @Override
    public int getCarsCount()
    {
        return new Random().nextInt(15);
    }
}
