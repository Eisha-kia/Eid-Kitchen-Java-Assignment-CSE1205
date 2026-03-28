/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eid.kitchen;

/**
 *
 * @author User
 */
public class EidKitchen {

    public static void main(String[] args) {
       

        MilkDessert semai = new MilkDessert("Semai", 8, "Cow Milk");
        DateDessert stuffedDates = new DateDessert("Stuffed Dates", 7, "Maryam Dates", "Almonds");
        CakeDessert rasmalaiCake = new CakeDessert("Rasmalai Tres Leches", 9, "Vanilla");

        System.out.println("Eid Dessert Preparation Begins");

        Dessert d1 = semai;
        Dessert d2 = stuffedDates;
        Dessert d3 = rasmalaiCake;

        System.out.println("Dessert: " + d1.getName());
        d1.showIngredients();
        d1.preparation();
        semai.serve();
        System.out.println();

        System.out.println("Dessert: " + d2.getName());
        d2.showIngredients();
        d2.preparation();
        stuffedDates.gifted();
        System.out.println();

        System.out.println("Dessert: " + d3.getName());
        d3.showIngredients();
        d3.preparation();
        rasmalaiCake.serve();
        System.out.println();

        System.out.println("\nAll Eid desserts are ready!");
    }
}
    