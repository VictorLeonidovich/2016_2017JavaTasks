package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id,
и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        reader.close();

        BufferedReader inputStream1 = new BufferedReader(new FileReader(file1));
        String readByte;
        while ((readByte = inputStream1.readLine()) != null){
    if (readByte.startsWith((args[0] + " "))) {
                    System.out.println(readByte);
                    //System.out.println(id + " " + productName + " " + price + " " + quantity);
                }
        }
        inputStream1.close();

    }
}


/*
while ((readByte = inputStream1.readLine()) != null){

        StringTokenizer tokenizer = new StringTokenizer(readByte, " ");
        while (tokenizer.hasMoreTokens()){
        id  = Integer.parseInt(tokenizer.nextToken());
        productName = tokenizer.nextToken();
        price = (Double.parseDouble((tokenizer.nextToken())));
        quantity = Integer.parseInt(tokenizer.nextToken());
        if (id == (Integer.parseInt(args[0]))) {
        System.out.println(readByte);
        //System.out.println(id + " " + productName + " " + price + " " + quantity);
        }

        }
        }*/
