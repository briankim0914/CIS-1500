package com.example.final3;

import java.util.Scanner;

public class Run {
    NPC randomNPC = new NPC();
    int loopStopper = 1;
    int loopStopper2 =1;
    double avatarHealthPoints;
    double avatarStrength;
    double avatarIntelligence;
    double avatarTotalGold;
    double position;

    public void runMethod(double avatarHealthPoints,double avatarStrength,double avatarIntelligence,double avatarTotalGold) {
        double diceRoll = Math.round(Math.random() * (20 - 1) + 1);
        System.out.println("This is the NPC's total health: "+randomNPC.hitPoint);
        System.out.println("This is the NPC's strength: "+randomNPC.strengthOfNPC);
        System.out.println("This is the NPC's dexterity: "+randomNPC.dextOfNPC);
        System.out.println("This is the NPC's intelligence: "+randomNPC.intOfNPC);
        System.out.println("");
                if (diceRoll >= randomNPC.intOfNPC) {
                    System.out.println("The diceroll value was "+diceRoll+" which is greater than the intelligence of the NPC. You can runaway! Which direction would you like to run to?");
                    while(loopStopper<=0){
                        Scanner keyboard4 = new Scanner(System.in);
                        String userDirection2 = keyboard4.nextLine();
                        if (userDirection2.equalsIgnoreCase("up")) {
                            position-=1;
                            if(position>9.9||position<0){
                                System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                                position+=1;
                                continue;
                            }
                            System.out.println(avatarHealthPoints);
                            Room createRoom = new Room();
                            createRoom.Room(avatarIntelligence,avatarStrength, avatarHealthPoints, avatarTotalGold,position);
                        }
                        if (userDirection2.equalsIgnoreCase("down")) {
                            position += 1;
                            if(position>9.9||position<0){
                                System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                                position-=1;
                                continue;}
                            Room createRoom = new Room();
                            createRoom.Room(avatarIntelligence, avatarStrength,avatarHealthPoints, avatarTotalGold, position);
                        }
                        if (userDirection2.equalsIgnoreCase("right")) {
                            position +=.1;
                            if(position>9.9||position<0){
                                System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                                position-=.1;
                                continue;}
                            else{Room createRoom = new Room();
                                createRoom.Room(avatarIntelligence, avatarStrength, avatarHealthPoints, avatarTotalGold, position);}
                        }
                        if (userDirection2.equalsIgnoreCase("left")) {
                            position -= .1;
                            if(position>9.9||position<0){
                                System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                                position+=.1;
                                continue;}
                            else{Room createRoom = new Room();
                                createRoom.Room(avatarIntelligence, avatarStrength, avatarHealthPoints, avatarTotalGold, position);}
                        }

                    }
            }
                if (diceRoll< randomNPC.intOfNPC){
                    avatarHealthPoints -=(Math.round(randomNPC.strengthOfNPC/3));
                    System.out.println("The diceroll value was "+diceRoll+" which is less than the intelligence of the NPC. This means it has attacked you before you could run away! This is your health after the attack: "+avatarHealthPoints);
                    System.out.println("Which direction would you like to go next?");
                    while(loopStopper2<=0){
                        Scanner keyboard4 = new Scanner(System.in);
                        String userDirection = keyboard4.nextLine();
                        if (userDirection.equalsIgnoreCase("up")) {
                            position-=1;
                            if(position>9.9||position<0){
                                System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                                position+=1;
                                continue;
                            }
                            System.out.println(avatarHealthPoints);
                            Room createRoom = new Room();
                            createRoom.Room(avatarIntelligence,avatarStrength, avatarHealthPoints, avatarTotalGold,position);
                        }
                        if (userDirection.equalsIgnoreCase("down")) {
                            position += 1;
                            if(position>9.9||position<0){
                                System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                                position-=1;
                                continue;}
                            Room createRoom = new Room();
                            createRoom.Room(avatarIntelligence, avatarStrength,avatarHealthPoints, avatarTotalGold, position);
                        }
                        if (userDirection.equalsIgnoreCase("right")) {
                            position +=.1;
                            if(position>9.9||position<0){
                                System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                                position-=.1;
                                continue;}
                            Room createRoom = new Room();
                                createRoom.Room(avatarIntelligence, avatarStrength, avatarHealthPoints, avatarTotalGold, position);
                        }
                        if (userDirection.equalsIgnoreCase("left")) {
                            position -= .1;
                            if(position>9.9||position<0){
                                System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                                position+=.1;
                                continue;}
                            Room createRoom = new Room();
                                createRoom.Room(avatarIntelligence, avatarStrength, avatarHealthPoints, avatarTotalGold, position);
                        }

                    }
                }
    }
}
