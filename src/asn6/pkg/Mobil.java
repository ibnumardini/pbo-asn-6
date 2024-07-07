/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asn6.pkg;

import asn6.pkg.blueprint.Mesin;

/**
 *
 * @author ibnumardini
 */
public class Mobil {

    private final String fuel;
    private final Mesin engine;
    private final int numberOfSeat;

    public Mobil(String fuel, Mesin engine, int numberOfSeat) {
        this.fuel = fuel;
        this.engine = engine;
        this.numberOfSeat = numberOfSeat;
    }

    public String getFuel() {
        return this.fuel;
    }

    public Mesin getEngine() {
        return this.engine;
    }

    public int getNumberOfSeat() {
        return this.numberOfSeat;
    }
}
