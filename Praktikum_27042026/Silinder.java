/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

public class Silinder extends Lingkaran {
    private double tinggi;

    // Constructor default
    public Silinder() {
        super();
        this.tinggi = 0;
    }

    // Constructor berparameter
    public Silinder(double r, double t) {
        super(r);
        this.tinggi = t;
    }

    // Setter & Getter
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    // Volume silinder = pi * r^2 * t
    public double getVolume() {
        return Math.PI * getR() * getR() * tinggi;
    }

    // Luas permukaan silinder = 2 * pi * r * (r + t)
    @Override
    public double getLuas() {
        return 2 * Math.PI * getR() * (getR() + tinggi);
    }

    @Override
    public String toString() {
        return String.format(
            "Silinder:\n  Jari-jari  = %.2f\n  Tinggi     = %.2f\n  Volume     = %.2f\n  Luas       = %.2f",
            getR(), tinggi, getVolume(), getLuas()
        );
    }
}
