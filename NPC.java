package com.example.final3;

public class NPC {
    double hitPoint = Math.round((Math.random() * (6 - 1) + 1));
    double strengthOfNPC;
    double dextOfNPC;
    double intOfNPC;
    NPC() {
        hitPoint = hitPoint;
        strengthOfNPC = hitPoint*2;
        dextOfNPC = hitPoint*2;
        intOfNPC = hitPoint*2;
    }
}
