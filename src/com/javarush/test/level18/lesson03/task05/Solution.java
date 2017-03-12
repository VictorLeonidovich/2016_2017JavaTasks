package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static TreeSet treeSet = new TreeSet();
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        FileInputStream file = new FileInputStream(path);

        int readData;
        while (file.available() > 0)
        {
            readData = file.read();
            treeSet.add(readData);

        }
        for (Object result : treeSet){
            System.out.print((int)result + " ");
        }
    }
}
