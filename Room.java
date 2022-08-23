package com.example.final3;

import java.util.Scanner;

public class Room {

    double avatarHitPoints;
    double avatarStrength;
    double avatarDexterity;
    double avatarIntelligence;
    double avatarTotalGold;
    double position;
    public void Room(double avatarIntelligence, double avatarStrength, double avatarHitPoints,double avatarTotalGold,double position){
        System.out.println("You have entered a new room!\n");
        StatsTracker playerStats = new StatsTracker();
        playerStats.statTracker(avatarIntelligence,avatarStrength,avatarHitPoints,avatarTotalGold,position);
        double diceRoll = Math.round(Math.random()*(2-1)+1);
        System.out.println("\nBased on a random number generated between 1-2, if the number is 2, an NPC will spawn! If the number is 1, the room will be clear!");
        System.out.println("The number generated was "+diceRoll);
        if(diceRoll>=2){
            System.out.println("An NPC has appeared!");
            System.out.println("Would you like to attack or run? A/R");
            Scanner keyboard = new Scanner(System.in);
            String userInput = keyboard.nextLine();
            if(userInput.equalsIgnoreCase("a")){
                Attack roomAttack = new Attack();
                roomAttack.attackMethod(avatarStrength,avatarHitPoints,avatarTotalGold,avatarIntelligence,position);

            }
            if(userInput.equalsIgnoreCase("r")){
                Run roomRun = new Run();
                roomRun.runMethod(avatarHitPoints,avatarStrength,avatarIntelligence,avatarTotalGold);
            }
        }
        else{
            System.out.println("This room is clear of NPCs would you like to look around or sleep? L/S");
            Scanner keyboard3 = new Scanner(System.in);
            String userInput3 = keyboard3.nextLine();
            if(userInput3.equalsIgnoreCase("l")){
                Search roomSearch = new Search();
                roomSearch.searchMethod(avatarIntelligence,avatarTotalGold,avatarStrength,avatarHitPoints,position);
            }
            else{
                Sleep roomSleep = new Sleep();
                roomSleep.sleepMethod(avatarHitPoints,avatarStrength,avatarIntelligence,avatarTotalGold,position);
            }
        }
    }
}
