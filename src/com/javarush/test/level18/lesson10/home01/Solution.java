package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.InputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream(args[0]);
        int ch = 0;
        int count = 0;
        while(inputStream.available() > 0){
            ch = inputStream.read();
            if (((ch < 91) && (ch > 64))||(((ch < 123) && (ch > 96)))) { count++;}

        }
        System.out.println(count);
        inputStream.close();


    }
}
