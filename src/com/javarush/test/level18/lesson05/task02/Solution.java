package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inputStream = new FileInputStream(fileName);
        int counter = 0;
        int symb;

        while (inputStream.available() > 0) {
            symb = inputStream.read();
            if (symb == 44) counter++;
        }

        System.out.println(counter);
        inputStream.close();
        reader.close();
    }
}

/*
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try
        {
            fileName = reader.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        //FileReader inputStream = null;

        BufferedReader inputStream = null;
        try
        {
            inputStream = new BufferedReader(new FileReader(fileName));

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        String text = null;
        try
        {
            text = inputStream.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        int commaCount = 0;
        for (char ch : text.toCharArray()){
            int ascii = (int) ch;
            if (ascii == 44){
                commaCount++;
            }
        }
        System.out.println(commaCount);

        try
        {
            inputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}*/
