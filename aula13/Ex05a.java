import java.util.Scanner;

public class Ex05a {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("nome: ");
        String nome = ler.nextLine();
        int tamanho = nome.length();
        System.out.println("tamanho: "+tamanho);
    }
}
