package com.example.helloworld;

public class HootDrinkShop {

    public static void main(String[] args) {
        Drinks coffee = new Coffee();
        coffee.joinWorkshop(new ProduceDrink());

        coffee.manufacture();
        Drinks machito = new Machito();
        machito.joinWorkshop(new ProduceDrink());

        machito.manufacture();
        Drinks tea = new Tea();
        tea.joinWorkshop(new ProduceDrink());
        
        tea.manufacture();

    }
}
