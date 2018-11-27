package at.ac.fhkufstein;

import javax.swing.*;

public class Vehicle
{
    private int power; //kW
    private double weight; //kg
    private String name; //text

    public Vehicle(int power, double weight, String name)
    {
        this.power = power;
        this.weight = weight;
        this.name = name;
    }


    public String getName()
    {
        return name;
    }

    public void calculateHorsePower()
    {
        JOptionPane.showMessageDialog(null, "Die Pferdestärke beträgt: " + power * 1.36d);
    }
}
