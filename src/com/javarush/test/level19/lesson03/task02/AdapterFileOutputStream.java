package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream,
чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    FileOutputStream amigoStringWriter;

    public AdapterFileOutputStream(FileOutputStream amigoStringWriter)
    {
        this.amigoStringWriter = amigoStringWriter;
    }

    @Override
    public void flush() throws IOException
    {
        this.amigoStringWriter.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
        this.amigoStringWriter.write(s.getBytes());

    }

    @Override
    public void close() throws IOException
    {
this.amigoStringWriter.close();
    }
}

