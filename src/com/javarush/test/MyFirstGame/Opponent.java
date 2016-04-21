package com.javarush.test.MyFirstGame;

/**
 * Created by Mistes on 20.04.2016.
 */
public class Opponent
{
    public static class Orc
    {
        private static int Orcarmor = 20;
        private static int hp = 215;

        public static int getOrcArmor()
        {
            return Orcarmor;
        }
        public static int getOrcHp()
        {return hp;}
        public static void orcCall(){
            System.out.println("You choose ORC ENEMY");
        }
    }
}
