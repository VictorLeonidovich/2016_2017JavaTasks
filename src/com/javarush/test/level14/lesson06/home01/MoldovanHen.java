package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Victor on 01.01.2017.
 */
public class MoldovanHen extends Hen implements Country
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 5;
    }
    public String getDescription(){return super.getDescription() +
            " Моя страна - "+Country.MOLDOVA+". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";}

}
