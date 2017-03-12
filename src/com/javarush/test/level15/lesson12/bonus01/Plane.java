package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Victor on 31.01.2017.
 */
public class Plane  implements Flyable
{
    int countPassengers;

    public Plane(int countPassengers)
    {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly()
    {

    }
}
