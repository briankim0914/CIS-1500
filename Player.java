package com.example.final3;

public class Player {
    double hitPoint;
    double strength;
    double dexterity;
    double intelligence;
    double totalGold;
    double position;

    Player() {
        hitPoint = 20;
        strength = (Math.round(Math.random() * (6 - 1) + 1))+(Math.round(Math.random() * (6 - 1) + 1))+(Math.round(Math.random() * (6 - 1) + 1));
        dexterity = (Math.round(Math.random() * (6 - 1) + 1))+(Math.round(Math.random() * (6 - 1) + 1))+(Math.round(Math.random() * (6 - 1) + 1));
        intelligence =(Math.round(Math.random() * (6 - 1) + 1))+(Math.round(Math.random() * (6 - 1) + 1))+(Math.round(Math.random() * (6 - 1) + 1));
        totalGold = 0;
        position = 0.0;
    }
}
// Questions: How to get my buttons to move circle and how to map

