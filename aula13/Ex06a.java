import java.util.Scanner;

public class Ex06a {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("nome: ");
        String nome = ler.nextLine();
        System.out.println("letra na pos 6 : "+ nome.charAt(6));

    }
}
