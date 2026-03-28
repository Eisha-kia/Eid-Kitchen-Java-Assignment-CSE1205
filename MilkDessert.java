/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eid.kitchen;

/**
 *
 * @author User
 */
public class MilkDessert extends Dessert implements Serveable{
    private String milkType;

    public MilkDessert(String name, int sweetnessLevel, String milkType) {
        super(name, sweetnessLevel);
        this.milkType = milkType;
    }
    
    @Override
    public void preparation() {
        System.out.println("Mom is preparing the semai by roasting the vermicelli in ghee until it turns golden brown and then simmering it with milk, sugar, and cardamom until the dessert becomes thick and creamy.");
    }
    
    @Override
    public void showIngredients() {
        System.out.println("Ingredients: Vermicelli (Semai),"+milkType+" , Sugar, Ghee (Clarified butter) and Cardamom ");
    }
    
    public void serve() {
        System.out.println(getName()+" is served in small glass bowls.");
    }
}
