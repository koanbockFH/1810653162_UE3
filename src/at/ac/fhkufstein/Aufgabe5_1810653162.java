package at.ac.fhkufstein;

public class Aufgabe5_1810653162
{
    public static void main(String[] args)
    {
        Vehicle auto = new Vehicle(100, 300.5, "Auto");
        Vehicle lastwagen = new Vehicle(300, 1300.5, "Lastwagen");

        System.out.println("PrintName:" + auto.getName());
        System.out.println("PrintName:" + lastwagen.getName());

        auto.calculateHorsePower();
        lastwagen.calculateHorsePower();
    }
}

