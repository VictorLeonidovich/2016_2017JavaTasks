package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        ArrayList<Integer> list1 = new ArrayList<>();

        reader.close();
        BufferedReader inputStream1 = new BufferedReader(new FileReader(file1));
        BufferedWriter outputStream2 = new BufferedWriter(new FileWriter(file2));
        String readByte;

        while ((readByte = inputStream1.readLine()) != null){
            String toWrite = "";
            StringTokenizer tokenizer = new StringTokenizer(readByte, " ");
            while (tokenizer.hasMoreTokens()){
                toWrite = tokenizer.nextToken();
                toWrite = (int)Math.round(Double.parseDouble(toWrite)) + " ";
                outputStream2.write(toWrite);
            }

        }
        outputStream2.close();
        inputStream1.close();


    }
}
