package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader inputStream = new BufferedReader(new FileReader(file1));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file2));
        String s0;
        String[] s1;
        while ((s0 = inputStream.readLine()) != null){
            try
            {
                s1 = s0.split(" ");
                for (int i = 0; i < s1.length; i++)
                {
                    try
                    {
                        Integer.parseInt(s1[i]);
                        outputStream.write(s1[i] + " ");
                    }
                    catch (NumberFormatException e){
                        //System.out.println(e);
                    }
                }


            }catch (Exception e){
                continue;
            }


        }
        outputStream.close();
        inputStream.close();
    }
}


/*public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        Scanner inputStream = new Scanner(new File(file1));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file2));
        //String s;
        while (inputStream.hasNext()){
            try
            {
                //s = "" + inputStream.nextInt();
                outputStream.write(inputStream.nextInt());

            }catch (Exception e){
                continue;
            }


        }
        outputStream.close();
        inputStream.close();*/