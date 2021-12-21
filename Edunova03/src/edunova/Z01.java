package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
        int[] broj = new int[3];

        broj[0] = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj:"));
        broj[1] = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj:"));
        broj[2] = Integer.parseInt(JOptionPane.showInputDialog("Unesi treći cijeli broj:"));

        if (broj[0] >= broj[1] && broj[0] >= broj[2]) {
            System.out.println(broj[0]);
        } else if (broj[1] >= broj[0] && broj[1] >= broj[2]) {
            System.out.println(broj[2]);
        } else if (broj[2] >= broj[0] && broj[2] >= broj[1]) {
            System.out.println(broj[2]);
        } else {
            System.out.println("Ne odgovarajući broj!");
        }
    }
}
