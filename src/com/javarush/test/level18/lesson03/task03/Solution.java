package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/



public class Solution
{
    //public static int max = 2147483647;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        FileInputStream file = new FileInputStream(path);

        int readData;
        while (file.available() > 0)
        {
            readData = file.read();
            addToList(readData);

        }
        file.close();
        reader.close();
        for (int i = 0; i < list.size(); i++)
        {
            map.put(list.get(i), 1);
        }

        biteSearcher(list);
        //System.out.println(list);

        print(map);


    }

    private static void addToList(int readData)
    {
        list.add(readData);
    }

    private static void biteSearcher(ArrayList<Integer> list)
    {
        Integer param;
        for (int i = 0; i < list.size(); i++)
        {

            param = list.get(i);

            for (Map.Entry entry : map.entrySet())
            {
                //System.out.println("key = " + entry.getKey() + " Value = " + entry.getValue());

                if ((Integer)entry.getKey() == 0)
                {
                    map.put(param, 1);
                } else if (entry.getKey().equals(param))
                {
                    map.put(param, (Integer)entry.getValue() + 1);
                }

            }

        }


    }


    private static void print(Map<Integer, Integer> map)
    {
        Integer max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > max)
            {
                max = entry.getValue();
            }

        }
        StringBuffer sb = new StringBuffer("");
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue().equals(max))
            {
                /*for (int i = 0; i < max; i++)
                {*/
                    sb = sb.append(entry.getKey()).append(" ");
                /*}*/
            }

        }
        System.out.println(sb);
    }
}

