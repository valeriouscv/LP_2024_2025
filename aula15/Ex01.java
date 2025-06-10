import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        /* ENUNCIADO:
         * contar as vogais do nome
         */
        int contaVogais=0;
        System.out.println("Digite o seu nome: ");
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine().toLowerCase();
        //nome= "valerio santos"
        for(int i=0; i<nome.length(); i++){
            char letra = nome.charAt(i); //pegar a letra na posicao indicada 
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contaVogais++;
            }
        }
        System.out.println("temos "+contaVogais+" vogais");
        ler.close();
    }
}