public class Ex03a {
   public static void main(String[] args) {
        //String.compareTo(outraString)
        String nome = "ana";
        String outroNome = "pedro";

        if (nome.compareTo(outroNome) == 0) {
            System.out.println("sao iguais");
        }else{
            if (nome.compareTo(outroNome) > 0) {
                System.out.println(nome + " eh maior");
            }else{
                System.out.println(outroNome + " eh maior");
            }
        }
   } 
}
