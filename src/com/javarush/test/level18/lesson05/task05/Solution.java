package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws DownloadException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String fileName = null;
            try
            {
                fileName = reader.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            int file = 0;
            try
            {
                file = new FileInputStream(new File(fileName)).available();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if (file < 1000)
            {
                try
                {
                    reader.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                throw new DownloadException();
            }


        }


    }

    public static class DownloadException extends Exception
    {

    }
}
