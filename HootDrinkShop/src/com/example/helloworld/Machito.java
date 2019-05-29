package com.example.helloworld;
public class Machito extends Drinks{
        @Override
        public void manufacture() {
            System.out.println("Manufactoring Machito...");
            bartenders.stream().forEach(workshop -> workshop.work(this));
            System.out.println("Done.");
            System.out.println();
        }
        @Override
        public int minWorkTime() {
            return 10;
        }
    }

