package com.example.final3;

import java.util.Scanner;

public class Search {
    double totalGold;
    double intelligence;
    double strength;
    double hitPoints;
    double position;
    int loopStopper=0;
    public void searchMethod(double intelligence, double totalGold,double strength,double hitPoints,double position){
        double diceRoll = Math.round(Math.random()*20);
        if(diceRoll< intelligence){
            totalGold+=10;
            System.out.println("Congratulations! You found 10 Gold");
            System.out.println("Which direction would you like to go next? up/down/left/right");
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
            System.out.println("No Gold Found in this room");
            System.out.println("Which direction would you like to go next? up/down/left/right");
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
                    position -=.1;
                    if(position>9.9||position<0){
                        System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                        position+=.1;
                        continue;}
                    Room createRoom = new Room();
                    createRoom.Room(intelligence, strength, hitPoints, totalGold, position);
                }

            }
        }

    }

}
