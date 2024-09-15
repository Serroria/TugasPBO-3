/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelasku.matematikaa;

/**
 *
 * @author meryl
 */
public class MatematikaInheritance {
    public static void main(String[]args){
         Matematikaa jumlah = new Matematikaa (20, 30);
        jumlah.pertambahan();
        
        Matematikaa substract = new Matematikaa (10, 5);
        substract.pengurangan();
        
        Matematikaa multiply = new Matematikaa (10, 3);
        multiply.perkalian();
        
        Matematikaa divide = new Matematikaa (21, 2);
        divide.pembagian();
        
        Matematika2 mod = new Matematika2(5, 4);
        mod.modulus();
    }
}
