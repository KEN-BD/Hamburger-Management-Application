/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hamburgermanagementapllication;

/**
 *
 * @author Lenovo
 */
public class HealthyBurger extends Hamburger {
    
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat,double price) {
        super("Healthy", "Brown Rye",meat, price);
    }
    
    public void addHealthAddition1(String name, double price){
    this.healthyExtra1Name = name;
    this.healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price){
    this.healthyExtra2Name = name;
    this.healthyExtra2Price = price;
    }

    @Override
    public double itimizeHamburger() {
        double hamburgerPrice = super.itimizeHamburger(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    if(healthyExtra1Name != null){
    hamburgerPrice += this.healthyExtra1Price;
        System.out.println("added "+this.healthyExtra1Name+" for extra: "+this.healthyExtra1Price);
    }
     if(healthyExtra2Name != null){
    hamburgerPrice += this.healthyExtra2Price;
          System.out.println("added "+this.healthyExtra2Name+" for extra: "+this.healthyExtra2Price);
    }   
    return hamburgerPrice;
    }
}
