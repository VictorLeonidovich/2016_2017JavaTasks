package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        InputStream inputStream1 = new FileInputStream(file1);
        OutputStream outputStream2 = new FileOutputStream(file2);
        OutputStream outputStream3 = new FileOutputStream(file3);


        while (inputStream1.available() > 0)
        {
            list.add(inputStream1.read());
        }
        for (int i = 0; i < list.size(); i++)
        {


            if ((list.size() % 2) == 0)
            {
                if ((list.size() / 2) > i)
                {
                    outputStream2.write(list.get(i));
                } else
                {
                    outputStream3.write(list.get(i));
                }
            } else { if (((list.size()) / 2) >= i)
                {
                    outputStream2.write(list.get(i));
                } else
                {
                    outputStream3.write(list.get(i));
                }

            }


        }
        outputStream3.close();
        outputStream2.close();
        inputStream1.close();
        reader.close();


    }
}
