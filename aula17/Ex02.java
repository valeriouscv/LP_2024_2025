package aula17;

import java.util.Scanner;

public class Ex02 {
    public static char lerLetra(String mensagem){
        System.out.println(mensagem);
        Scanner ler = new Scanner(System.in);
        char res=ler.next().charAt(0);
        ler.close();
        return res;
    }
    public static void main(String[] args) {
        char letra = lerLetra("Digite uma letra: ");
        System.out.println("letra: "+letra);
    }
}
