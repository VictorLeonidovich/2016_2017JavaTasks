package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    static int max = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        FileInputStream file = new FileInputStream(path);

        int readData;
        while(file.available()>0){
            readData = file.read();
            maxFunction(readData);
        }
        file.close();
        reader.close();
        System.out.println(max);


    }

    private static void maxFunction(int readData)
    {
        if (readData > max) {max = readData;}
    }
}
