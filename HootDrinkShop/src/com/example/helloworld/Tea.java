package com.example.helloworld;

public class Tea extends Drinks {

        @Override
        public void manufacture() {
            System.out.println("Manufactoring Tea");
            bartenders.stream().forEach(workshop -> workshop.work(this));
            System.out.println("Done.");
            System.out.println();
        }
        @Override
        public int minWorkTime() {
            return 20;
        }
    }

