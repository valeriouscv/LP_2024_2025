package aula16;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //posicao           0   1   2   3   4
        char[]     vogais={'a','e','i','o','u'};
        int[] contaVogais={ 0,  0,  0,  0,  0};
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = ler.nextLine();
        //ciclo para percorrer cada letra de um texto
        for(int i=0; i< texto.length(); i++){
            char letra = texto.charAt(i); //pegar cada letra do texto
            //ciclo percorrer cada vogal
            for(int j=0; j<vogais.length; j++){
                //se a letra for vogal, incrementa o contador
                if(letra == vogais[j]) contaVogais[j]++; 
            }
        }
       for(int j=0; j<vogais.length; j++){
        System.out.println(vogais[j]+" aparece "+contaVogais[j]+" vez(es)");
       }
    }
}
