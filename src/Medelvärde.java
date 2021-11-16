import javax.swing.*;
import java.util.Scanner;

public class Medelvärde {
    public static void main(String[] args) {
        String antalS = JOptionPane.showInputDialog("Hur många tal matas in?");
        int antal = Integer.parseInt(antalS);
        int[] lista = new int[antal];
        Scanner tgb = new Scanner(System.in);
        int summa = 0;

        System.out.println("Skriv in talen");
        for (int i = 0; i < lista.length; i++ ) {
            lista[i] = tgb.nextInt();
            summa = summa + lista[i];
        }
        float medel = summa;
        medel / lista.length;
        System.out.println(medel);

        int index = 0;
        int störsthittils = 4;
        while (index < lista.length){
            if (störsthittils < lista[index]);{
                störsthittils = lista[index];
            }
            index++;
        }

        int index2 = 0;
        int minsthittils = 4;
        while (index2 < lista.length){
            if (minsthittils > lista[index2]);{
                minsthittils = lista[index2];
            }
            index2++;
        }

        System.out.println("Största: " + störsthittils + "\nMinsta: " + minsthittils);
    }
}
