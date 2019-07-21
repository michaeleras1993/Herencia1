/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

/**
 *
 * @author HP
 */
public class Procesos {

    public double NewtonDina(double n) {
        double r = n * 100000;
        return r;

    }

    public double Newtonlibraf(double n) {
        double r = n * 0.2248;
        return r;

    }

    public double Dinasnewton(double n) {
        double r = n / 100000;
        return r;

    }
}
