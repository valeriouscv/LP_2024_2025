package aula18;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        //aluno 1
        Aluno a = new Aluno();
        a.numAluno = 7561;
        a.nome = "zinsky";
        a.idade = 18;
        //aluno 2
        Aluno b = new Aluno();
        b.numAluno = 7915;
        b.nome = "kely";
        b.idade = 18;
        //aluno 3
        Aluno c = new Aluno();
        c.numAluno = 7927;
        c.nome = "ridney";
        c.idade = 19;

        //lista de alunos
        ArrayList<Aluno> lista = new ArrayList<>();
        lista.add(a);
        lista.add(b);
        lista.add(c);

        //percorrer a lista
       /*  for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i).nome);
        }*/

        //ciclo aprimorado : foreach
        for (Aluno aluno : lista) {
            System.out.println(aluno.nome);
        }
    }
}
