package aula18;
public class Ex01 {
    public static double mediaDasNotas(double[] notas){
        double soma=0.0;
        double media=0.0;
        for(int i=0; i<notas.length; i++){
            soma = soma + notas[i]; // soma += notas[i]; 
        }  
        media = soma / (double) notas.length;
        return media;
    }
    public static void main(String[] args) {
                 //pos   0     1      2     3      //tam=4
        double[] notas={12.3, 15.0, 13.8, 18.5};
        double media = mediaDasNotas(notas);
        System.out.println("media: "+media);
    }
}
