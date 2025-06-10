package aula11;

import java.util.Scanner;

/*
ENUNCIADO:
Faça um programa em Java que pede informações ao utilizador (nome, idade e sexo)
e mostra uma mensagem do género: "Ola [nome], tens  [idade] anos e és um [rapaz/menina]".
Validar as entradas para idade e para o sexo.
*/
public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Como te chamas? ");
        String nome = ler.nextLine();
        int idade;
        do{
            System.out.print("Quantos anos tens? ");
            idade = ler.nextInt();
        }while(idade<0 || idade > 150);
       
        ler.nextLine(); //leitura em branco. limpar o buffer do teclado
        System.out.print("Qual é o teu sexo? (m - masculino, f - feminino): ");  //0  1 2
        char sexo = ler.nextLine().charAt(0); //"a n a"
        switch (sexo) {
            case 'm':
            case 'M':
                System.out.println("Ola, sou "+nome+" tens "+idade+" anos e sou um rapaz");
                break;
            case 'f':
            case 'F':
                System.out.println("Ola, sou "+nome+" tens "+idade+" anos e sou uma menina");
                break;
            default:
                System.out.println("Ola, sou "+nome+" tens "+idade+" anos. Em relação ao sexo, não quero indicar");
        }
    }
}
