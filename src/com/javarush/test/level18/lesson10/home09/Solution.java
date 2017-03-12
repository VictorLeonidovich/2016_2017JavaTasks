package com.javarush.test.level18.lesson10.home09;

/* Файлы и исключения
Читайте с консоли имена файлов
Если файла не существует (передано неправильное имя файла), то
перехватить исключение FileNotFoundException,
вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки. Не использовать try-with-resources
Не используйте System.exit();
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream reader1 = null;
        String file1 = null;

        while (true)
        {

            try
            {
                file1 = reader.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            try
            {
                reader1 = new FileInputStream(file1);

            }catch (FileNotFoundException e)
            {
                System.out.println(file1);
                try
                {
                    if (reader1 != null) reader1.close();
                    if (reader != null) reader.close();
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
                break;

            }


        }

        try
        {
            if (reader1 != null) reader1.close();

            if (reader != null) reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
