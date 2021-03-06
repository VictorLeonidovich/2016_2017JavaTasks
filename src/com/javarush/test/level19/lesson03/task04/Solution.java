package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
 Метод read() должен читать данные одного человека.
*/

public class Solution
{
    public static class PersonScannerAdapter implements PersonScanner
    {

        Scanner scanner;

        public PersonScannerAdapter(Scanner scanner)
        {
            this.scanner = scanner;

        }

        @Override
        public Person read() throws IOException
        {
            String firstName = null;
            String middleName = null;
            String lastName = null;
            Date birthDate = null;
            /*while (this.scanner.hasNext())
            {*/
                lastName  = scanner.next();
                firstName  = scanner.next();
                middleName = scanner.next();
                /*SimpleDateFormat format = new SimpleDateFormat();
                format.applyPattern("dd MM yyyy");*/
            int dd = scanner.nextInt();
            int mm = scanner.nextInt();
            int yy = scanner.nextInt();
                birthDate = new GregorianCalendar(yy, mm - 1, dd).getTime();
                //String s =  + " " + scanner.next() + " " + scanner.next();
                /*try
                {
                    birthDate = format.parse(s);
                }
                catch (ParseException e)
                {
                    e.printStackTrace();
                }*/
            /*}*/

            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException
        {
            this.scanner.close();
        }
    }
}
