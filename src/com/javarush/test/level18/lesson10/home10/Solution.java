package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        while (!(file = reader.readLine()).equals("end")){
            list.add(file);
    }
        reader.close();
        file = "part";
        InputStream inputStream = null;
        OutputStream outputStream = new FileOutputStream(list.get(0).replaceAll(".part\\d", ""));
        for (int i = 0; i < list.size(); i++)
        {
            String filePart = file + (i + 1);
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(j).endsWith(filePart)){
                    inputStream = new FileInputStream(list.get(j));

                    while (inputStream.available() > 0){
                        outputStream.write(inputStream.read());

                    }

                    inputStream.close();
                }
            }

        }
        outputStream.close();



    }
}
