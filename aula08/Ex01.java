package aula08;

import java.util.Scanner;

public class Ex01 {
    //ENUNCIADO: fatorial de n
    //n! = n*(n-1)!
    //5! = 5 x 4 x 3 x 2 x 1 = 120
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = ler.nextInt();

        long res=1L;
        for(long i=n; i >0; i-- ){
            res = res * i;
        }
        System.out.println(n+"! = "+res);

    }
}
