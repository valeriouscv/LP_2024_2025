import java.util.Scanner;

public class Ex02a {
    public static void main(String[] args) {
        String nome = "Valerio";
        
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String outroNome = ler.nextLine();

        //método equals -> String.equals(outraString)
       /*if(nome.equals(outroNome)){
            System.out.println("Acertou. Sao iguais.");
        }else{
            System.out.println("Errou feio. Errou rude...");
        }*/
        
        //método equalsIgnoreCase -> String.equalsIgnoreCase(outraString)
        if(nome.equalsIgnoreCase(outroNome)){
            System.out.println("Acertou. Sao iguais.");
        }else{
            System.out.println("Errou feio. Errou rude...");
        }
    }
}
