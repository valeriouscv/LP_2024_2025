package aula10;

import java.util.Scanner;

public class Ex02 {
    /*ENUNCIADO: 
     Faça um algoritmo que, dado um numero natural, calcule a soma de 
     todos os seus digitos.
     Exemplo: n=123, Resultado: 1 + 2 + 3 = 6  */
    public static void main(String[] args) {
        System.out.print("numero: ");
        Scanner ler = new Scanner(System.in);
        int num = ler.nextInt();   
        int soma= 0;
        int quociente = num / 10; 
        int resto = num % 10;
        while(quociente != 0){
            soma = soma + resto;
            resto = quociente % 10; 
            quociente = quociente / 10;
         }
         soma = soma + resto; //o ultimo resto
        System.out.println("soma: "+soma);
        ler.close();
    }
}
