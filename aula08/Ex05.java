package aula08;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        while(true){
            System.out.println("Digite um numero: ");
            int n = ler.nextInt();
            if(n == 10) break;
        }
    }
}
