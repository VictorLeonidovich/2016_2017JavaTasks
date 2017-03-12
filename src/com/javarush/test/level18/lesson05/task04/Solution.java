package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    private static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1;
        String file2;
        FileInputStream inputStreamReader1;
        FileOutputStream outStreamReader2;
        try
        {
             file1 = reader.readLine();
            file2 = reader.readLine();
            inputStreamReader1 = new FileInputStream(file1);
            outStreamReader2 = new FileOutputStream(file2);
            while (inputStreamReader1.available() > 0){
                list.add(inputStreamReader1.read());
            }
            for (int i = list.size() - 1; i >=0 ; i--)
            {
                outStreamReader2.write((int) list.get(i));
            }
            outStreamReader2.close();
            inputStreamReader1.close();
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }





    }
}
