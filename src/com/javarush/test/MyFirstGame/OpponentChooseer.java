package com.javarush.test.MyFirstGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Mistes on 20.04.2016.
 */
public class OpponentChooseer
{
    public static int oponentarmor;
    public static int opponenthp;
    public static void OpponentChose()
    {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Choose your ENEMY: 1==Dragon---2==Princess-----3==ORC");

            while (true)
            {
                int value = Integer.parseInt(reader.readLine());
                if (value == 3)
                {
                    oponentarmor = Opponent.Orc.getOrcArmor();
                    opponenthp = Opponent.Orc.getOrcHp();
                    Opponent.Orc.orcCall();
                    break;
                }
                if (value == 2)
                {

                    System.out.println("You choose Princess BUT IT NOT WORK MUHAHA");
                    break;
                }
                if (value == 1)// leather here
                {

                    System.out.println("You choose Dragon BUT IT NOT WORK MUHAHA");
                    break;
                }
            }

        }
        catch (Exception e)
        {
            System.out.println("EXCEPTION IN READER MOTHERFUCKER");
        }
    }
}
