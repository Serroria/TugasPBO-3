/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kelasku.suhu;

/**
 *
 * @author meryl
 */
public class KonversiSuhu {
int C;
    
     public double celciusToFahrenheit() {
        double hasil = (C * 9.0 / 5.0) + 32;
        System.out.println("Konversi Celcius ke Fahrenheit adalah " + hasil);
        return hasil;
    }
    
    public double celciusToReamur(){
       double hasil = (4.0 / 5.0) * C;
       
      System.out.println("Konversi Celcius ke Reamur adalah "+ hasil);
       return hasil;
    }
}
