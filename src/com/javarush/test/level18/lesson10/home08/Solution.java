package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз,
 и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();


    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        Thread thread = null;
        while (!(file = reader.readLine()).equals("exit")){
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
        public synchronized void fileReading()
        {

            ArrayList<Integer> list = new ArrayList<>();
            InputStream inputStream = null;
            try
            {
                inputStream = new FileInputStream(fileName);
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            //читаем байты
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
            int max = 0;
            int maxCol = 0;
            int maxFreq = 0;
            for (int i = 0; i < list.size(); i++)
            {
                maxCol = Collections.frequency(list, list.get(i));
                if (maxCol > max)
                {
                    max = maxCol;
                    maxFreq = list.get(i);
                }
            }
            resultMap.put(fileName, maxFreq);
            try
            {
                inputStream.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }

        @Override
        public void run()
        {
            fileReading();
        }
    }
}
