/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StarbuzzCoffe;

/**
 *
 * @author oscar
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Express();
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Milk(beverage2);
                beverage2 = new Milk(beverage2);
		beverage2 = new WhipCream(beverage2);
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Chocholate(beverage3);
		beverage3 = new WhipCream(beverage3);
	
                System.out.println("--------------------TICKET--------------------");
                System.out.println("1. " + beverage.getDescripcion()+ ": $" + beverage.costo());
                System.out.println("2. " + beverage2.getDescripcion()+ ": $" + beverage2.costo());
                System.out.println("3. " + beverage3.getDescripcion()+ ": $" + beverage3.costo());
                System.out.println("----------------------------------------------");
    }
}
