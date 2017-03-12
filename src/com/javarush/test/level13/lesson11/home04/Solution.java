package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String path = reader.readLine();
        ArrayList list = new ArrayList();
        String r = null;
        while (!"exit".equals(r))
        {
             r = reader.readLine();
            list.add(r);
            list.add("\r\n");
        }
        OutputStream file = new FileOutputStream(path);
        for (Object l : list){
            file.write(((String)l).getBytes());

        }


        file.close();
        reader.close();


    }
}
