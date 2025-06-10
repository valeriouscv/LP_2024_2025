package aula14;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //Faça um program em java que peça o nome ao utilizador
        //e crie o email institucional deste.
        //exemplo: 
        //nome: Lamine António Marizús dos Santos Tavares
        //email:lamine.tavares@us.edu.cv
        Scanner ler = new Scanner(System.in);
        System.out.print("Como te chamas? ");
        String nome = ler.nextLine();

        int posEsp = nome.indexOf(' ');
        int posUlEsp = nome.lastIndexOf(' ');
        int tam = nome.length();

        String primeiro = nome.substring(0,posEsp);
        String ultimo = nome.substring(posUlEsp+1, tam);
        String email = primeiro + "."+ultimo+"@us.edu.cv";
        email = email.toLowerCase(); //email fica a minucula
        System.out.println("email: "+email);

        ler.close(); //fechar a leitura
    }
}
