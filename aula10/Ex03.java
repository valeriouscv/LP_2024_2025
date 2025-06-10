package aula10;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        String nome = "Roronoa Zoro";
        int idade = 21;
        String estaEm = "EggHead";
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Qual é o seu manga preferido: ");
        String manga = ler.nextLine();
        System.out.println("O meu manga preferido é: "+manga);
        
        System.out.println("Qual é a letra inicial do teu nome: ");
        char letra = ler.nextLine().charAt(0);
        System.out.println("Letra: "+letra);


    }
}
