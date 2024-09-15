/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelasku.suhu;

/**
 *
 * @author meryl
 */
public class KonversiSuhu2 extends KonversiSuhu {
    double F;
    
     public double FahrenheitToReamur(){
        double hasil = 4.0 / 9.0 * (F - 32);
        System.out.println("Konversi Fahrenheit ke Reamur adalah "+ hasil);
        return hasil;
    }
}
