/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

public class Kerucut extends Lingkaran {
    private double tinggi;

    // Constructor default
    public Kerucut() {
        super();
        this.tinggi = 0;
    }

    // Constructor berparameter
    public Kerucut(double r, double t) {
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

    // Volume kerucut = 1/3 * pi * r^2 * t
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * getR() * getR() * tinggi;
    }

    // Luas permukaan kerucut = pi * r * (r + s), s = garis pelukis = sqrt(r^2 + t^2)
    @Override
    public double getLuas() {
        double s = Math.sqrt(getR() * getR() + tinggi * tinggi);
        return Math.PI * getR() * (getR() + s);
    }

    @Override
    public String toString() {
        return String.format(
            "Kerucut:\n  Jari-jari  = %.2f\n  Tinggi     = %.2f\n  Volume     = %.2f\n  Luas       = %.2f",
            getR(), tinggi, getVolume(), getLuas()
        );
    }
}
