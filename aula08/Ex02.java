package aula08;

public class Ex02 {
    //Ciclo For - Ciclo Infinito
    public static void main(String[] args) {
        long i=1;
        for(;;){
            if(i == 100) break;
                System.out.println(i+" ");
            i++;
        
        }
        System.out.println("FIM do CICLO");
    }
}
