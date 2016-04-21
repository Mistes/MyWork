package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        try
        {

            while (true)
            {
                String n1 = reader.readLine();
                int i = Integer.parseInt(n1);
                sum+=i;
                if (n1.equals("сумма"))
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println(sum);
        }

    }
}
