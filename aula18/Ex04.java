package aula18;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) throws FileNotFoundException {
        File ficheiro = new File("alunos.txt");
   
        if(ficheiro.exists()){
           // System.out.println("exite");
           Scanner ler = new Scanner(ficheiro);
           while (ler.hasNext()) {
                String linha = ler.nextLine();
                System.out.println(linha);
           }
           ler.close();

        }else{
            System.out.println("o meu ficheiro nao existe");
        }
    }
}
