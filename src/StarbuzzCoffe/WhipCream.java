/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StarbuzzCoffe;

/**
 *
 * @author oscar
 */
public class WhipCream extends CondimentoDecorador{
    public WhipCream(Beverage beverage) {
        this.beverage=beverage;
    }
    @Override
    public String getDescripcion() {
        return beverage.getDescripcion() + " + WhipCream";
    }

    @Override
    public float costo() {
        float costo = beverage.costo();
        return costo += 7.49f;
    }
}
