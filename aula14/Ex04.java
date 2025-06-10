package aula14;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //Faça um program em java que peça o ano letivo e
        //o nome ao aluno e crie o email institucional deste.
        //exemplo: 
        //nome: helio jose semedo varela
        //      |                 |_____|
        //      v                  
        //email:hvarela.l24@us.edu.cv
        Scanner ler = new Scanner(System.in);
        System.out.println("ano letivo (ex: 2024/2025): ");
        String anoLetivo = ler.nextLine();
        anoLetivo = anoLetivo.substring(2,4); //pegar o 24
        System.out.println("Seu nome completo: ");
        String nome=ler.nextLine();
        String email =""+nome.charAt(0); //primeira letra
        int posUlEsp = nome.lastIndexOf(' ');
        int tam = nome.length();
        String ultimo = nome.substring(posUlEsp+1, tam); //ultimo apelido
        email = email + ultimo+".l"+anoLetivo+"@us.edu.cv";
        System.out.println("email: "+email);
    }
}
