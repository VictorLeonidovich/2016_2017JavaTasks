package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    static int min = 2147483647;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        FileInputStream file = new FileInputStream(path);

        int readData;
        while(file.available()>0){
            readData = file.read();
            minFunction(readData);
        }
        file.close();
        reader.close();
        System.out.println(min);


    }

    private static void minFunction(int readData)
    {
        if (readData < min) {min = readData;}
    }
}
