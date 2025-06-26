package aula18;
import java.util.ArrayList;
public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.remove(1);

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

    }
}
