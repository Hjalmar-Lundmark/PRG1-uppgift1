import javax.swing.*;
import java.util.Scanner;

public class Medelvärde {
    public static void main(String[] args) {
        String antalS = JOptionPane.showInputDialog("Hur många tal matas in?");
        int antal = Integer.parseInt(antalS);
        int[] lista = new int[antal];
        Scanner tgb = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++ ) {
            lista[i] = tgb;
        }


    }
}
