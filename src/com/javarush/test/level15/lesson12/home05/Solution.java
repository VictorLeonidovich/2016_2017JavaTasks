package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали
 конструкторам класса Solution.
*/

public class Solution {

    protected Solution(String t)
    {

    }

    protected Solution(String t, Integer i)
    {

    }

    protected Solution(String t, boolean b)
    {

    }

     Solution(Integer i)
    {

    }

     Solution(Integer i, String t)
    {

    }

     Solution(Integer i, boolean b)
    {

    }

    public Solution(boolean b)
    {

    }

    public Solution(boolean b, String t)
    {
    }

    public Solution(boolean b, Integer i)
    {

    }

    private Solution(String t, Integer i, boolean b)
    {

    }

    private Solution(Integer i, String t, boolean b)
    {

    }

    private Solution(boolean b, Integer i, String t)
    {

    }
}

