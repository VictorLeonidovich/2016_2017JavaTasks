package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static ArrayList<Integer> cicle (Integer num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++){

            if ((num%i)==0){list.add(i);}

        }

        return list;

    }


    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num1 = Integer.parseInt(reader.readLine());
        Integer num2 = Integer.parseInt(reader.readLine());
        ArrayList<Integer> nod1 = Solution.cicle(num1);
        ArrayList<Integer> nod2 = Solution.cicle(num2);
Integer maxNOD = 0;
        for (int i = 0; i < nod1.size(); i++){
            for (int j = 0; j < nod2.size(); j++){
                if (nod1.get(i).equals(nod2.get(j))){
                    if (nod1.get(i) > maxNOD){maxNOD = nod1.get(i);}
                }
            }
        }
        System.out.println(maxNOD);

    }
}
