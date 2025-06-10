import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex01a {
    public static void main(String[] args) {
        String nome = "Valerio"; //7 - letras
        //String  nome = new String("Valerio");
        String outroNome = "";   //0 - letras
        String outro = null;     //vazio

       // Scanner ler = new Scanner(System.in);
       // System.out.println("Como te chamas?");
       // String meuNome = ler.nextLine();
       // System.out.println("Chamo-me: "+meuNome);

        String ottuNome = JOptionPane.showInputDialog("Como te chamas?");
        JOptionPane.showMessageDialog(null,ottuNome);
        //System.out.println(ottuNome);
       
    }
}
