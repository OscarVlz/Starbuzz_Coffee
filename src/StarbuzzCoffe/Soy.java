/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StarbuzzCoffe;

/**
 *
 * @author oscar
 */
public class Soy extends CondimentoDecorador{
    public Soy(Beverage beverage) {
        this.beverage=beverage;
    }
    
    @Override
    public String getDescripcion() {
        return beverage.getDescripcion() + " + Soy";
    }

    @Override
    public float costo() {
        float costo = beverage.costo();
        return costo += 4.55f;
    }
}
