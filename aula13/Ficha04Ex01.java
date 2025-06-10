import java.util.Scanner;

public class Ficha04Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite um texto: ");
        String texto = ler.nextLine();
        int tam = texto.length(); //tamanho da String (qts carateres tem)
        int qtdPalavras = 1;

        for(int i=0; i< tam; i++){
            if(texto.charAt(i)== ' ') qtdPalavras++;
        }
        System.out.println("Temos "+tam+" letras e "+qtdPalavras+" palavras");
        ler.close();
    }
}
