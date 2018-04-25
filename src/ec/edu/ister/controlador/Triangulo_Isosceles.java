/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

/**
 *
 * @author SANTIAGO27
 */
public class Triangulo_Isosceles {
    private double base;
    private double lado;
    
    public Triangulo_Isosceles(double base, double lado) {
    this.base = base;
    this.lado = lado;
      
}

    Triangulo_Isosceles(double base, double lado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double obtenerPerimetro() {
        double perimetro = 2*lado+base;
        return perimetro;
    }
    public double obtenerArea(){
        double area = (base*Math.sqrt(lado*lado)-(base*base)/4)/2;
        return area;
    }
    
        
    
}
