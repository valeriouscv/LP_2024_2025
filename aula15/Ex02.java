import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //nome    : valerio
        //          ^     ^
        //          |     |
        //      pos:0     length()-1
        //mostrar : OIRELAV
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = ler.nextLine();
        String resultado  = "";
        for(int i=nome.length()-1; i>=0; i--){
            char letra = nome.charAt(i);   //obter cada letra do nome (de fim a inicio)
            resultado = resultado + letra; //juntar cada letra para formar palavra
        }
        resultado = resultado.toUpperCase(); //colocar a palavra a maiuscula
        System.out.println("Resultado: "+resultado);
        ler.close();
    }
}
