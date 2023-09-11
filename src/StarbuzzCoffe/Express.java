/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StarbuzzCoffe;

/**
 *
 * @author oscar
 */
public class Express extends Beverage{
    public Express(){
        descripcion="Express";
        
    }

    @Override
    public float costo() {
        return 36.00f;
    }
}
