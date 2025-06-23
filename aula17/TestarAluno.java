package aula17;

public class TestarAluno {
    public static void main(String[] args) {
        //int idade = 18;
        
        //reservar espaço para criar novo aluno
        Aluno deusa = new Aluno(); 
        
        //inicializar a variavel do tipo Aluno
        deusa.numAluno=7638;
        deusa.nome="Deusa Fortes";
        deusa.email="dfortes.l24@us.edu.cv";
        deusa.idade=18;
        deusa.morada="Flamengos";
        deusa.peso=62.0;
        deusa.telemovel="9183202";

        System.out.println(deusa.nome);
    }
}
