package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Victor on 01.01.2017.
 */
public class RussianHen extends Hen implements Country
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 20;
    }
    public String getDescription(){return super.getDescription() +
            " Моя страна - "+Country.RUSSIA+". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}

}
