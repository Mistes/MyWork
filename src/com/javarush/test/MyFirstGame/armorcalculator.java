package com.javarush.test.MyFirstGame;
import com.javarush.test.MyFirstGame.armor;

/**
 * Created by Mistes on 18.04.2016.
 */
public class armorcalculator
{
        public static int armorAmmount(){
        return armorchooser.chestarmor +armorchooser.legarmor + armorchooser.headarmor;
        }
    public static int speedcount(){
       int a =  armorchooser.chestmove +armorchooser.headmove + armorchooser.legmove + WeaponChooser.weaponspeed;

        if( a > 25)
        return 3;
        if(a > 50)
            return 4;
        if (a > 75)
            return 5;
        else return 1;
    }
    }

