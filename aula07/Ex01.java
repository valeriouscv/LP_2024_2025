package aula07;
import java.util.Scanner;
public class Ex01{
    public static void main(String[] args) {
        //char letra = 'v';
        //String nome = "Valerio Santos";
        //System.out.println("letra: "+letra);
        //System.out.println("Nome: "+nome);

        //objeto de leitura (a variavel ler passa a ser a nossa leitura )
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Ola, como te chamas? ");
        String nome = ler.nextLine();

        System.out.println("Quantos anos tens?");
        int idade = ler.nextInt();

        if(idade >= 40){
            System.out.println("Ola " +nome+" es kota");
        }else{
            System.out.println("Ola " +nome+" es Txota");
        }


    }
}