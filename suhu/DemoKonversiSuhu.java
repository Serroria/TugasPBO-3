/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelasku.suhu;

/**
 *
 * @author meryl
 */
public class DemoKonversiSuhu {
    
    
    public static void main(String[]args){
        KonversiSuhu suhu = new KonversiSuhu();
        
        KonversiSuhu CkF = new KonversiSuhu();
        CkF.C=50;
        CkF.celciusToFahrenheit();
        
        KonversiSuhu CkR = new KonversiSuhu();
        CkR.C=50;
        CkR.celciusToReamur();
        
        KonversiSuhu2 FkR = new KonversiSuhu2();
        FkR.F=70;
        FkR.FahrenheitToReamur();
        
        
    }
}
