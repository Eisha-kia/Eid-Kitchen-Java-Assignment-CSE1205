/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eid.kitchen;

/**
 *
 * @author User
 */
public class DateDessert extends Dessert implements Gift{
    private String dateType;
    private String nutType;

    public DateDessert(String name, int sweetnessLevel, String dateType, String nutType) {
        super(name, sweetnessLevel);
        this.dateType = dateType;
        this.nutType = nutType;
    }

    @Override
    public void preparation() {
        System.out.println("My sister is preparing "+getName()+" using " + dateType + " stuffed with " +nutType+ ".");
    }

    @Override
    public void showIngredients(){
        System.out.println("Ingredients: "+dateType+" and "+nutType+".");
    }
    
    public void gifted(){
        System.out.println("Stuffed Dates are placed in elegant Eid Date Boxes and gifted to others.");
    }
}
