package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int readByte;
        while (fileInputStream.available() > 0)
        {
            readByte = fileInputStream.read();
            list.add(readByte);
        }
        fileInputStream.close();
        for (int i = 0; i < list.size(); i++)
        {
            map.put(list.get(i), 0);
        }
        Integer param;
        for (int i = 0; i < list.size(); i++)
        {

            param = list.get(i);

            for (Map.Entry entry : map.entrySet())
            {
                //System.out.println("key = " + entry.getKey() + " Value = " + entry.getValue());
                if (entry.getKey().equals(param))
                {
                    map.put(param, (Integer) entry.getValue() + 1);


                }

            }
        }

        for (Map.Entry entry : map.entrySet())
        {
            System.out.println((char)(int)entry.getKey() + " " + entry.getValue());
        }


    }
}

