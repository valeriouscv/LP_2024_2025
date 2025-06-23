package aula17;

import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {
        String[] mes = {"invalido", "janeiro", "fevereiro","março","abril","maio","junho"};
        //                 0           1           2          3       4      5        6
        Scanner ler = new Scanner(System.in);
        System.out.println("indique uma data (dd/mm/aaaa) :");
        String hoje = ler.nextLine();
        Data dataHoje = new Data();
        dataHoje.dia = Integer.parseInt(hoje.substring(0,2));
        dataHoje.mes = Integer.parseInt(hoje.substring(3,5));
        dataHoje.ano = Integer.parseInt(hoje.substring(6,10));
        System.out.println(dataHoje.dia+" de "+mes[dataHoje.mes]+" de "+dataHoje.ano);
        ler.close();
    }
}
