/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eid.kitchen;

/**
 *
 * @author User
 */
public class Dessert {

    private String name;
    private int sweetnessLevel;

    public Dessert() {
    }

    public Dessert(String name, int sweetnessLevel) {
        this.name = name;
        this.sweetnessLevel = sweetnessLevel;
    }

    public String getName() {
        return name;
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }
    
    public void preparation() {
        System.out.println("Preparing....");
    }
    
    public void showIngredients() {
        System.out.println("Ingredients: ....");
    }

    
}
