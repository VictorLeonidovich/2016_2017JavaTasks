package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Victor on 29.12.2016.
 */
public class Keyboard implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();
    }
}
