package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        InputStream inputStream = new FileInputStream(file1);
        OutputStream outputStream = new FileOutputStream(file2);
        while (inputStream.available() > 0){
            inputStream.read();
            outputStream.write(inputStream.read());
        }
        outputStream.close();
        inputStream.close();
    }
}
