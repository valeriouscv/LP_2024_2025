package aula09;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Indique o dia da semana (1-7): ");
        int dia = ler.nextInt();
        if(dia==1){
            System.out.println("Domingo");
        }else{
            if(dia==2){
                System.out.println("Segunda-feira");
            }else{
                if (dia==3) {
                    System.out.println("Terca-feira");
                }else{
                    if (dia==4) {
                       System.out.println("Quarta-feira"); 
                    }else{
                        if(dia==5){
                            System.out.println("Quinta-feira");
                        }else{
                            if (dia==6) {
                                System.out.println("Sexta-feira");
                            }else{
                                if (dia==7) {
                                    System.out.println("Sabado");
                                }else{
                                    System.out.println("Dia Invalido");
                                }
                            }
                        }
                    }
                }
            }
        }
        ler.close();
    }
}
