package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        InputStream inputStream2 = new FileInputStream(file2);
        InputStream inputStream3 = new FileInputStream(file3);
        OutputStream outputStream1 = new FileOutputStream(file1);
        outputStream1.write("".getBytes());
        while (inputStream2.available() > 0){
            outputStream1.write(inputStream2.read());
        }
        while (inputStream3.available() > 0){
            outputStream1.write(inputStream3.read());
        }
        outputStream1.close();
        inputStream3.close();
        inputStream2.close();

    }
}
