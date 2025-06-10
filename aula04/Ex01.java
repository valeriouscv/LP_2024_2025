package aula04;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        // criar um objeto de leitura
        Scanner ler = new Scanner(System.in);
        // pedir valor ao utilizador
        System.out.println("Como te chamas? ");
        String nome = ler.nextLine();
        System.out.println("Qual e' o seu salario? ");
        double salario = ler.nextDouble();

        // mostrar o resultado
        System.out.println("Ola, " + nome + ", o teu salario e': " + salario + " CVE");
    }
}
