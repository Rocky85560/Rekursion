

package rekursionen;

import javax.swing.JOptionPane;

public class Rekursionen {

   
    public static void main(String[] args) {
        int zahl = 0;
        System.out.println("Ergebnis iterativ " + fakultaetIterativ(5));
        
        System.out.println("Ergebnis rekursiv " + fakultaetRekursiv(5));
        String eingabe = JOptionPane.showInputDialog("Bitte Zahl eingeben ");
        int a = Integer.parseInt(eingabe);
        eingabe = JOptionPane.showInputDialog("Bitte 2. Zahl eingeben ");
        int b = Integer.parseInt(eingabe);
        System.out.println("Der ggT der Zahlen " + a + " und " + b + " ist " +ggtteiler(a,b));
    }
    static int ggtteiler (int a, int b)
    {
        if (b == 0)
            return a;
        else return ggtteiler(b, a % b);
    }
    
    static int fakultaetIterativ (int zahl)
    {
        int zwischensumme = 1;
        if (zahl == 0) return 1;
        for (int i = 1; i <= zahl; i++)
            zwischensumme *= i;
    //    System.out.println ("Ergebnis iterativ " + zwischensumme);
    
    return zwischensumme;
    }
    static int fakultaetRekursiv(int zahl)
    {
        if (zahl == 0)
            return 1;
        else 
            return (zahl * fakultaetRekursiv(zahl-1));
    }
}
