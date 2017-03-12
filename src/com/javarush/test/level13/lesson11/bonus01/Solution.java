package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        String readChar;
        while ((readChar = fileReader.readLine()) != null){
            list.add(Integer.parseInt(readChar));
        }

        fileReader.close();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++)
        {
            if ((list.get(i) % 2) == 0){
                System.out.println(list.get(i));
            }

        }

    }
}
