package aula14;

public class Ex02 {
    public static void main(String[] args) {

        String nome = "Deusa Carolina da Veiga Fortes";
        System.out.println("nome: "+nome);
        System.out.println("nome maiuscula: "+nome.toUpperCase());
        System.out.println("nome minuscula: "+nome.toLowerCase());
        System.out.println("tamanho: "+nome.length());
        System.out.println("primeira letra: "+nome.charAt(29));
        System.out.println("posicao da letra 's' : "+nome.indexOf('s'));
        System.out.println("ultima posicao da letra 's' : "+nome.lastIndexOf('s'));
        System.out.println("texto: "+nome.substring(0, 4+1));
        String nome2 = "    mauro carvalho    ";
        nome2 = nome2.trim();
        System.out.println("outro nome: "+nome2);
        System.out.println("tamanho: "+nome2.length());
    }
}
