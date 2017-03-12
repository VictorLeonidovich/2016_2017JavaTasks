package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        reader.close();
        BufferedReader inputStream = new BufferedReader(new FileReader(file1));
        String s0;
        String[] s1;
        int count = 0;
        while ((s0 = inputStream.readLine()) != null){
            s1 = (s0 + " ").split("\\p{P}?[ \\t\\n\\r]+");
            for (int i = 0; i < s1.length; i++)
            {
                if (s1[i].equals("world")) {count++;}
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
