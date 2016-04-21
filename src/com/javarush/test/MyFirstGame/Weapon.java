package com.javarush.test.MyFirstGame;

/**
 * Created by Mistes on 20.04.2016.
 */
public class Weapon
{
    public static class Mace{
        private static int speed = 20;
        private static int damage = 50;
        public static int getSpeed(){
            return speed;
        }
        public static int getDamage(){
            return damage;
        }
        public static void weaponcall(){
            System.out.println("You choose MACE!!!!");
        }
    }
}
