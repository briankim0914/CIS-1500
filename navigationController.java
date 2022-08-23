package com.example.final3;

import java.util.Scanner;

public class navigationController {
    Player avatarStats2 = new Player();

    //avatarStats2.position >= 0.0 && avatarStats2.position <= 9.9
    public void navController() {
        System.out.println("Which direction would you like to go? Up/Down/Left/Right");
        int loopStopper = 0;
        while(loopStopper<=0){
        Scanner keyboard4 = new Scanner(System.in);
        String userDirection = keyboard4.nextLine();

            if (userDirection.equalsIgnoreCase("up")) {
                avatarStats2.position-=1;
                if(avatarStats2.position>9.9||avatarStats2.position<0){
                    System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                    avatarStats2.position+=1;
                    continue;
                }
                Room createRoom = new Room();
                createRoom.Room(avatarStats2.intelligence, avatarStats2.strength, avatarStats2.hitPoint, avatarStats2.totalGold, avatarStats2.position);
            }
            if (userDirection.equalsIgnoreCase("down")) {
                avatarStats2.position += 1;
                if(avatarStats2.position>9.9||avatarStats2.position<0){
                    System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                    avatarStats2.position-=1;
                    continue;}
                Room createRoom = new Room();
                createRoom.Room(avatarStats2.intelligence, avatarStats2.strength, avatarStats2.hitPoint, avatarStats2.totalGold, avatarStats2.position);
            }
            if (userDirection.equalsIgnoreCase("right")) {
                avatarStats2.position += .1;
                if(avatarStats2.position>9.9||avatarStats2.position<0){
                    System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                    avatarStats2.position-=.1;
                    continue;}
                Room createRoom = new Room();
                createRoom.Room(avatarStats2.intelligence, avatarStats2.strength, avatarStats2.hitPoint, avatarStats2.totalGold, avatarStats2.position);
            }
            if (userDirection.equalsIgnoreCase("left")) {
                avatarStats2.position -=.1;
                if(avatarStats2.position>9.9||avatarStats2.position<0){
                    System.out.println("You cannot go that way, please choose a different direction! up/down/right/left");
                    avatarStats2.position+=.1;
                    continue;}
                Room createRoom = new Room();
                createRoom.Room(avatarStats2.intelligence, avatarStats2.strength, avatarStats2.hitPoint, avatarStats2.totalGold, avatarStats2.position);
            }
        }





    }}