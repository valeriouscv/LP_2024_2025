package aula07;

public class Ex02 {
    public static void main(String[] args) {
        
        int idade = 54;
        
        //operador ternario
        String msg = (idade >= 40)  ?  "kota"  :  "txota";
                   // condicao        verdade    falso  
        System.out.println("Ola, es "+msg);
    }
}
