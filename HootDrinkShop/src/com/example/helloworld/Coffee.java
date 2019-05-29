package com.example.helloworld;

import java.util.BitSet;

public class Coffee extends Drinks{
    @Override
    public void manufacture() {
        System.out.println("Manufactoring Cofee...");

        bartenders.stream().forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }
    @Override
    public int minWorkTime() {
        return 5;
    }

}
