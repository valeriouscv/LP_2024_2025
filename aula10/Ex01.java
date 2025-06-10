package aula10;

import java.util.Scanner;
//DO WHILE
public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double  nota;
        do{
            System.out.print("nota: ");
            nota = ler.nextDouble();
        }while(nota < 0 || nota > 20);
       //quando eu sair do ciclo eh pq temos uma nota valida
       System.out.println("Parabens..Tiveste: "+nota+" valores");
       ler.close();
    }
}
