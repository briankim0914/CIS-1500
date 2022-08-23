package com.example.final3;

import java.util.Scanner;

public class StatsTracker {
  double intelligence;
  double strength;
  double health;
  double totalGold;
  double avatarPosition;
  public void statTracker(double intelligence, double strength, double health, double totalGold,double avatarPosition){
    System.out.println("This is your current health: "+health);
    System.out.println("This is your intelligence: "+intelligence);
    System.out.println("This is your strength: "+strength);
    System.out.println("This is the amount of gold you currently have: "+totalGold);
    System.out.printf(("This is your current position: ")+"%.1f", avatarPosition);
    System.out.println("");
  }
}
