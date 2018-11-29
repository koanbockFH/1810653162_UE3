package at.ac.fhkufstein;

import javax.swing.*;

public class Aufgabe2_1810653162
{
    public static void main(String[] args) throws Exception
    {
        partialString(JOptionPane.showInputDialog("Gib einen Text ein:"));

        //Aufgabe 3

        System.out.println(Taschenrechner.Addition(3,5));
        System.out.println(Taschenrechner.Subtraktion(3,5));
        System.out.println(Taschenrechner.Division(3,5));
        System.out.println(Taschenrechner.Multiplikation(3,5));

        System.out.println(Taschenrechner.Addition(3.5,5.5));
        System.out.println(Taschenrechner.Subtraktion(3.5,5.5));
        System.out.println(Taschenrechner.Division(3.5,5.5));
        System.out.println(Taschenrechner.Multiplikation(3.5,5.5));
    }

    private static void partialString(String a) throws Exception
    {
        if(a.length() > 3)
        {
            System.out.println(a.substring(a.length()/2));
        }
        else
        {
            System.err.println("String hat zu wenig Zeichen"); //lt. Lektor hinschreiben damit die Aufgabe nach Stoff
            // Fortschritt geht
            // geht
            throw new Exception("String hat zu wenig Zeichen");

        }
    }
}
