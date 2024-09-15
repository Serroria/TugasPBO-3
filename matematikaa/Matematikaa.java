/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package kelasku.matematikaa;

/**
 *
 * @author meryl
 */
public class Matematikaa {

    int a, b;

    public Matematikaa() {
        this.a = a;
        this.b = b;
    }
//konstruktor

    public Matematikaa(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int tambah() {
        int hasil = a + b;
        return hasil;
    }

    public int kurang() {
        int hasil = a - b;
        return hasil;
    }

    public int kali() {
        int hasil = a * b;
        return hasil;
    }

    public double bagi() {
        double hasil = a / b;
        return hasil;
    }

    public void pertambahan() {
        System.out.println("Pertambahan: " + a + " + " + b + " = " + tambah());
    }

    public void pengurangan() {
        System.out.println("Penguranga: " + a + " - " + b + " = " + kurang());
    }

    public void perkalian() {
        System.out.println("Perkalian: " + a + " * " + b + " = " + kali());
    }

    public void pembagian() {
        System.out.println("Pembagian: " + a + " / " + b + " = " + bagi());
    }
}
