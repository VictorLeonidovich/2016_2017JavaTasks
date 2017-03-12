/*
package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

*/
/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз,
 и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*//*


public class Solution
{
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();


    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        Thread thread = null;
        while (!(file = reader.readLine()).equals("exit"))
        {
            thread = new ReadThread(file);
            thread.start();
            thread.join();
        }
        reader.close();

        System.out.println(resultMap);

    }

    public static class ReadThread extends Thread
    {
        String fileName;

        public ReadThread(String fileName)
        {
            this.fileName = fileName;

            //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run()
        {
            ArrayList<Integer> list = new ArrayList<>();
//читаем байты
            InputStream inputStream = null;
            try
            {
                inputStream = new FileInputStream(fileName);
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            int readData;
            try
            {
                while (inputStream.available() > 0)
                {
                    readData = inputStream.read();
                    list.add(readData);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < list.size(); i++)
            {
                map.put(list.get(i), 1);
            }

            // считаем байты

            Integer param;
            for (int i = 0; i < list.size(); i++)
            {

                param = list.get(i);

                for (Map.Entry entry : map.entrySet())
                {
                    //System.out.println("key = " + entry.getKey() + " Value = " + entry.getValue());

                    if ((Integer) entry.getKey() == 0)
                    {
                        map.put(param, 1);
                    } else if (entry.getKey().equals(param))
                    {
                        map.put(param, (Integer) entry.getValue() + 1);
                    }

                }

            }

            //ищем max

            Integer max = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if (entry.getValue() > max)
                {
                    max = entry.getValue();
                }

            }
            Integer maxValue = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if (entry.getValue().equals(max))
                {
                */
/*for (int i = 0; i < max; i++)
                {*//*

                    maxValue = entry.getKey();
                */
/*}*//*

                }

            }
            resultMap.put(fileName, maxValue);

            try
            {
                inputStream.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
*/
