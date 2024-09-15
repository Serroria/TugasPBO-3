/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelasku.matematikaa;

/**
 *
 * @author meryl
 */
public class Matematika2 extends Matematikaa {

    /**
     *
     * @param a
     * @param b
     */
    public Matematika2(int a, int b) {
    this.a = a;
    this.b = b;
}


    double modul() {
        int hasil = a % b;
        return hasil;

    }

    public void modulus() {
        System.out.println("Modulus: " + a + " % " + b + " = " + modul());
    }

}
