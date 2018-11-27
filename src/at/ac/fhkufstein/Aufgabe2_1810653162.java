package at.ac.fhkufstein;

import javax.swing.*;

public class Aufgabe2_1810653162
{
    public static void main(String[] args) throws Exception
    {
        partialString(JOptionPane.showInputDialog("Gib einen Text ein:"));
    }

    private static void partialString(String a) throws Exception
    {
        if(a.length() > 3)
        {
            System.out.println(a.substring(a.length()/2));
        }
        else
        {
            throw new Exception("String hat zu wenig Zeichen");
        }
    }
}
