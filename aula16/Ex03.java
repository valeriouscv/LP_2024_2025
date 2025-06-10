package aula16;

public class Ex03 {
    public static void main(String[] args) {
        int[] idades = new int[100];
        for (int i = 0; i < idades.length; i++) {
            if(i%2==0){
                idades[i]=18;
            }else{
                idades[i]=i+1;
            }
            System.out.println("idades["+i+"]="+idades[i]);
        }
    }
}
