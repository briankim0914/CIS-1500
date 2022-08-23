package com.example.final3;

import java.util.Scanner;

public class Sleep {
    double hitPoints;
    double strength;
    double intelligence;
    double totalGold;
    double position;
    int loopStopper =0;
    public void sleepMethod(double hitPoints,double strength, double intelligence, double totalGold,double position){
        double diceRoll = Math.round(Math.random()*(6-1)+1);
        System.out.println("Based on a diceroll, an NPC will spawn while you are sleeping if the diceroll value is 6");
        System.out.println("The diceroll value was "+diceRoll+"\n");

        if(diceRoll<6){
            hitPoints = hitPoints-hitPoints+20;
            System.out.println("You have gotten good sleep and your health has been fully restored to 20.0!");
            System.out.println("Which direction would you like to go next? up/down/right/left");
            while(loopStopper<=0){
                Scanner keyboard4 = new Scanner(System.in);
                String userDirection = keyboard4.nextLine();
                if (userDirection.equalsIgnoreCase("up")) {
                    position-=1;
                    if(position>9.9||position<0){
                        System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                        position+=1;
                        continue;
                    }
                    Room createRoom = new Room();
                    createRoom.Room(intelligence,strength, hitPoints, totalGold,position);
                }
                if (userDirection.equalsIgnoreCase("down")) {
                    position += 1;
                    if(position>9.9||position<0){
                        System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                        position-=1;
                        continue;}
                    Room createRoom = new Room();
                    createRoom.Room(intelligence, strength, hitPoints, totalGold, position);
                }
                if (userDirection.equalsIgnoreCase("right")) {
                    position +=.1;
                    if(position>9.9||position<0){
                        System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                        position-=.1;
                        continue;}
                    else{Room createRoom = new Room();
                        createRoom.Room(intelligence, strength, hitPoints, totalGold, position);}
                }
                if (userDirection.equalsIgnoreCase("left")) {
                    position -= .1;
                    if(position>9.9||position<0){
                        System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                        position+=.1;
                        continue;}
                    else{Room createRoom = new Room();
                        createRoom.Room(intelligence, strength, hitPoints, totalGold, position);}
                }

            }}

        else{
            System.out.println("An NPC has appeared and it is stopping you from sleeping! Would you like to attack it or run? A/R");
            Scanner keyboard3 = new Scanner(System.in);
            String runOrAttack = keyboard3.next();
            if (runOrAttack.equalsIgnoreCase("A")){
                Attack roomAttack = new Attack();
                roomAttack.attackMethod(strength,hitPoints,totalGold,intelligence,position);
            }
            else{
                Run roomRun = new Run();
                roomRun.runMethod(hitPoints,strength,intelligence,totalGold);
            }
        }
    }

}
