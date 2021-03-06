package at.ac.fhkufstein;

import java.time.Instant;

public class Aufgabe4_1810653162
{
    public static void main(String[] args)
    {
        System.out.println(fibonacciFolgeIterativ(40));
        System.out.println(fibonacciFolgeRecursiv(40));
    }

    private static long fibonacciFolgeRecursiv(long n)
    {
        //Abbruchbedingungen
        if(n == 0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        //Rekursive berechnung der Fibonacci Reihe
        return fibonacciFolgeRecursiv(n-1) + fibonacciFolgeRecursiv(n-2);
    }

    private static long fibonacciFolgeIterativ(long n)
    {
        //Muss mit -1 starten da 0 benötigt wird um die zweite 1 zu berechnen
        int prev = -1, next = 1, result =0;
        for(int i = 0; i <= n; i++)
        {
            result = prev+next;
            prev = next;
            next = result;
        }
        return result;
    }
}
