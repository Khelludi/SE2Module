package com.example.helloworld;

import java.util.concurrent.TimeUnit;

public class  ProduceDrink extends Bartender {
    public ProduceDrink(){
        super();
    }
    @Override
    public void work(Drinks hootDrinkShop) {
        System.out.print("Producing... ");
        long timeToTake = 300 * hootDrinkShop.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake); // Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}
