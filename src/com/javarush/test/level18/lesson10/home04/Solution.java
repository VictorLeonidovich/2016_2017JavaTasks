package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        reader.close();
        ArrayList<Integer> list1 = new ArrayList<>();

        InputStream inputStream1 = new FileInputStream(file1);
        InputStream inputStream2 = new FileInputStream(file2);

        while (inputStream1.available() > 0){
            list1.add(inputStream1.read());

        }
        OutputStream outputStream1 = new FileOutputStream(file1);

        outputStream1.write("".getBytes());

        while (inputStream2.available() > 0)
        {
            outputStream1.write(inputStream2.read());
        }
        for (int i = 0; i < list1.size(); i++)
        {
            outputStream1.write(list1.get(i));

        }
        outputStream1.close();
        inputStream2.close();
        inputStream1.close();

    }
}
