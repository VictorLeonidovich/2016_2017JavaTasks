package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String path = reader.readLine();
        InputStream file = new FileInputStream(path);
        while (file.available() > 0)
        {
            int readData = file.read();
            System.out.print((char) readData);
        }

        file.close();
        reader.close();


    }
}


/*
import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        //FileInputStream file;
        BufferedReader file;
        try
        {
            path = reader.readLine();
            file = new BufferedReader(new FileReader(path));
            String readData;

            readData = file.readLine();
            System.out.print(readData);


            file.close();
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }




    }
}*/
