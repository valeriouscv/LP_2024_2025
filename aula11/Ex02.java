package aula11;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //Funçoes Matematicas
        //double pi = 3.14;
       // System.out.println("PI: "+ Math.PI);
       // System.out.println(Math.sqrt(3));
        //System.out.println(Math.random()*10);


        //Fórmula de Báskara (Formula Resolvente)
        //delta = b^2 - 4ac
        // x1 = (-b + raizq(delta))/2a
        // x2 = (-b - raizq(delta))/2a
        Scanner ler = new Scanner(System.in);
        System.out.print("a: ");
        int a = ler.nextInt();
        System.out.print("b: ");
        int b = ler.nextInt();
        System.out.print("c: ");
        int c = ler.nextInt();

        double delta = Math.pow(b,2) - 4*a*c;
        double x1 = (-1*b  + Math.sqrt(delta))/(2*a);
        double x2 = (-1*b  - Math.sqrt(delta))/(2*a);
        System.out.println(a+"x^2+"+b+"x + "+c);
        System.out.println("raizes {"+x1+","+x2+"}");
    }
}
