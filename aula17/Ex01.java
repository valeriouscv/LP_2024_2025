package aula17;

import java.util.Scanner;

public class Ex01{
   //declaracao do metodo
    public static void soma(int a, int b){
        int res = a+b;
        System.out.println(res);
    }
    public static int soma2(int a, int b){
        int res = a+b;
        return res;
    }
    public static void soma3(){
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o valor de a :");
        int a = ler.nextInt();
        System.out.println("digite o valor de b: ");
        int b=ler.nextInt();
        int res = a + b;
        System.out.println("Resultado: "+res);
        ler.close();
    }
    public static void main(String[] args){
        //invocacao do metodo
        soma(2,3);
        soma(3,3);
        soma(4,4);
        
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o valor de a :");
        int a = ler.nextInt();
        System.out.println("digite o valor de b: ");
        int b=ler.nextInt();
        soma(a, b);
        ler.close();


        int res = soma2(2, 3);
        System.out.println("soma2:"+res);
    }

     
}