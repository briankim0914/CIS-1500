package com.example.final3;

import java.util.Scanner;

public class Attack {
    double diceRoll = Math.round(Math.random()*20);
    NPC randomNPC = new NPC();
    double playerStrength;
    double playerHitPoint;
    double intelligence;
    double totalGold;
    double position;
    int loopStopper = 1;
    public void attackMethod(double playerStrength, double playerHitPoint,double totalGold,double intelligence,double position){
        System.out.println("This is the NPC's total health: "+randomNPC.hitPoint);
        System.out.println("This is the NPC's strength: "+randomNPC.strengthOfNPC);
        System.out.println("This is the NPC's dexterity: "+randomNPC.dextOfNPC);
        System.out.println("This is the NPC's intelligence: "+randomNPC.intOfNPC);
        System.out.println("");
        System.out.println("Let's see who will attack first based on the dice roll: "+diceRoll);
        while(loopStopper>0){
        if(diceRoll>= randomNPC.dextOfNPC){
            System.out.println("The diceroll was greater than the dexterity of the NPC!");
            randomNPC.hitPoint-=(Math.round(playerStrength/3));
            System.out.println("You have attacked the NPC! This is the NPC's health after the attack: "+randomNPC.hitPoint);
            if (randomNPC.hitPoint>0){
                randomNPC.hitPoint-=Math.round((playerStrength/3));
                System.out.println("You have attacked the NPC! This is the NPC's health after the attack: "+randomNPC.hitPoint);

            }
            if (playerHitPoint<=0){
                System.out.println("You have died!");
                System.exit(0);
                loopStopper = 0;
            }
            if (randomNPC.hitPoint<=0){
                System.out.println("The NPC has died");
                System.out.println("Now that the room is empty, would you like to look around or sleep? L/S");
                Scanner keyboard2 = new Scanner(System.in);
                String userInput2 = keyboard2.nextLine();
                if (userInput2.equalsIgnoreCase("l")){
                    Search roomSearch = new Search();
                    roomSearch.searchMethod(intelligence,totalGold,playerStrength,playerHitPoint,position);
                }
                else{
                    Sleep roomSleep = new Sleep();
                    roomSleep.sleepMethod(playerHitPoint,playerStrength,intelligence,totalGold,position);
                }
            }
        }
        if(diceRoll< randomNPC.dextOfNPC){
            System.out.println("The diceroll was less than the dexterity of the NPC!");
            playerHitPoint -=Math.round((randomNPC.strengthOfNPC/3));
            System.out.println("The NPC has attacked you! This is your health after the attack: "+playerHitPoint);
            if (randomNPC.hitPoint>0){
                randomNPC.hitPoint-=Math.round((playerStrength/3));
                System.out.println("You have attacked the NPC! This is the NPC's health after the attack: "+randomNPC.hitPoint);

            }
            if (playerHitPoint<=0){
                System.out.println("You have died!");
                System.exit(0);
                loopStopper = 0;
            }
             if (randomNPC.hitPoint<=0){
                System.out.println("The NPC has died");
                System.out.println("Now that the room is empty, would you like to look around or sleep? L/S");
                Scanner keyboard2 = new Scanner(System.in);
                String userInput2 = keyboard2.nextLine();
                if (userInput2.equalsIgnoreCase("l")){
                    Search roomSearch = new Search();
                    roomSearch.searchMethod(intelligence,totalGold,playerStrength,playerHitPoint,position);
                }
                else{
                    Sleep roomSleep = new Sleep();
                    roomSleep.sleepMethod(playerHitPoint,playerStrength,intelligence,totalGold,position);
                }
            }
        }
        }


    }

}
