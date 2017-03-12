package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileReader;

import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception{
        int countSpace = 0;
        int countAll = 0;
        FileInputStream in = new FileInputStream(args[0]);
        while (in.available() > 0){
            countAll++;
            if(in.read() == ' ')countSpace++;
        }

        float result = (float) ((float)countSpace/countAll*100.0);

        System.out.println(String.format(Locale.ENGLISH, "%.2f", result));

        in.close();





        /*BufferedReader stream = new BufferedReader(new FileReader(args[0]));

        String countTotalLine = "";
        int countBreak = 0;
        String readByte;
        while ((readByte = stream.readLine()) != null){

            countTotalLine = countTotalLine + readByte;

        }
        int countTotal = countTotalLine.length();

        for (char br : countTotalLine.toCharArray())
        {

            if (" ".toCharArray()[0] == br)
            {
                countBreak++;
            }

        }

        System.out.println(String.format(Locale.ENGLISH,"%(.2f",(float)((double)countBreak/(double)countTotal*100)));
        stream.close();
*/

    }
}
