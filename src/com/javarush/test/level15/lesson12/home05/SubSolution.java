package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Victor on 05.01.2017.
 */
public class SubSolution extends Solution
{

    protected SubSolution(String t)
    {
        super(t);
    }

    protected SubSolution(String t, Integer i)
    {
        super(t, i);
    }

    protected SubSolution(String t, boolean b)
    {
        super(t, b);
    }

    SubSolution(Integer i)
    {
        super(i);
    }

    SubSolution(Integer i, String t)
    {
        super(i, t);
    }

    SubSolution(Integer i, boolean b)
    {
        super(i, b);
    }

    public SubSolution(boolean b)
    {
        super(b);
    }

    public SubSolution(boolean b, String t)
    {
        super(b, t);
    }

    public SubSolution(boolean b, Integer i)
    {
        super(b, i);
    }
    private SubSolution(String t, Integer i, boolean b)
    {
        super(b, i);

    }

    private SubSolution(Integer i, String t, boolean b)
    {
        super(b, t);

    }

    private SubSolution(boolean b, Integer i, String t)
    {
        super(b);

    }
}
