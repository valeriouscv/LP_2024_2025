package aula14;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome1 = "valerio";
        System.out.println("Como te chamas?");
        String nome2 = ler.nextLine();
        /*if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("Sou eu!!!");
        }else{
            System.out.println("Nao sou eu :( ");
        }*/
        /*if(nome1.compareToIgnoreCase(nome2) == 0){
            System.out.println("sao iguais");
        }else{
            if(nome1.compareToIgnoreCase(nome2) > 0){
                System.out.println(nome1+" eh maior");
            }else{
                System.out.println(nome2+" eh maior");
            }
        }*/
        //String nomeCompleto = nome1.concat(" ").concat(nome2);
        String nomeCompleto = nome1 + " " + nome2;
        System.out.println(nomeCompleto);
    }
}
