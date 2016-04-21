package com.javarush.test.MyFirstGame;

/**
 * Created by Mistes on 20.04.2016.
 */
public class DMG
{

    public static void damagaem(){
        int hpnow = OpponentChooseer.opponenthp;
        int then = hpnow;
        for(int i = 0; i <= armorcalculator.speedcount(); i++){
            System.out.println(" Hp your enemy is now " + then);

            int dmg =  (((WeaponChooser.weapondamage + (int)(Math.random()*10+10))- OpponentChooseer.oponentarmor) * criticalhit.Iscritical());

            then= then - dmg;
            System.out.println("You hit your enemy at " + dmg + " HP");
            if(then < 0){
                System.out.println("Your enemy is died! you are the best :*");
                break;
            }
            if(i ==armorcalculator.speedcount()){
                System.out.println("Your enemy still alive.try again! You left only " + then + " HP");
            }
        }
    }
}
