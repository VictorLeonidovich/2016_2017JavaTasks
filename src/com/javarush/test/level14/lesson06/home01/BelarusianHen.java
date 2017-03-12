package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Victor on 01.01.2017.
 */
public class BelarusianHen extends Hen implements Country
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 1;
    }
    public String getDescription(){return super.getDescription() +
            " Моя страна - "+Country.BELARUS+". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}
}
