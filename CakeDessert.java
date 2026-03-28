/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eid.kitchen;

/**
 *
 * @author User
 */
public class CakeDessert extends Dessert implements Serveable{
    private String flavor;

    public CakeDessert(String name, int sweetnessLevel, String flavor) {
        super(name, sweetnessLevel);
        this.flavor = flavor;
    }

    @Override
    public void preparation() {
        System.out.println("I placed the sponge cake in a big dish and soaked the cake with Rasmalai milk overnight. Then put a layer of Whipped cream on top and garnished with Crushed pistachios, Sliced almonds and Saffron.");
    }

    @Override
    public void showIngredients() {
        System.out.println("Ingredients: Vanilla sponge cake, Rasmalai milk, Whipped cream, Saffron, Crushed pistachios and Sliced almonds.");
    }

    public void serve() {
        System.out.println(getName()+" was cut into slices and served on dessert plates.");
    }
}
