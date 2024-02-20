/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hamburgermanagementapllication;

/**
 *
 * @author Lenovo
 */
public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String additional1Name;
    private double additional1Price;
    
    private String additional2Name;
    private double additional2Price;
    
    private String additional3Name;
    private double additional3Price;
    
    private String additional4Name;
    private double additional4Price;
    
    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }
    
    public void addHamburgerAddition1(String name, double price){
        this.additional1Name = name;
        this.additional1Price = price;
    }
    
    public void addHamburgerAddition2(String name, double price){
        this.additional2Name = name;
        this.additional2Price = price;
    }
    
    public void addHamburgerAddition3(String name, double price){
        this.additional3Name = name;
        this.additional3Price = price;
    }
    
    public void addHamburgerAddition4(String name, double price){
        this.additional4Name = name;
        this.additional4Price = price;
    }
    
public double itimizeHamburger(){
    double hamburgerPrice = this.price;
    System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll "
            +this.meat+ " price is: " + this.price);
    if(additional1Name!=null){
        hamburgerPrice += additional1Price;
        System.out.println("added" + this.additional1Name + "for an extra" + this.additional1Price);
    }
    if(additional2Name!=null){
        hamburgerPrice += additional2Price;
        System.out.println("added" + this.additional2Name + "for an extra" + this.additional2Price);
    }
    if(additional3Name!=null){
        hamburgerPrice += additional3Price;
        System.out.println("added" + this.additional3Name + "for an extra" + this.additional3Price);
    }
    if(additional4Name!=null){
        hamburgerPrice += additional4Price;
        System.out.println("added" + this.additional4Name + "for an extra" + this.additional4Price);
    }
    return hamburgerPrice;
}  
    
}
