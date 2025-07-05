
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestAlunos {
    public static void carregarAlunosFich(ArrayList<Aluno> lista) throws FileNotFoundException{
        File fich = new File("alunos.txt");
        Scanner ler = new Scanner(fich);
        while (ler.hasNext()) {
            String linha = ler.nextLine();
            //criar um novo aluno
            Aluno novoAluno = new Aluno();
            novoAluno.nome = linha;
            //colocar o aluno na lista
            lista.add(novoAluno);
        }
        System.out.println("todos os alunos foram carregados do ficheiro");
    }
    public static void listar(ArrayList<Aluno> lista){
        if(lista.isEmpty()){
            System.out.println("-- sem registos para listar --");
        }else{
            System.out.println("-- Lista dos Alunos --");
            for(int i=0; i< lista.size(); i++){
                Aluno aluno = lista.get(i);
                System.out.println("Aluno(a): "+aluno.nome);
            }
        }
    }
    public static void criarAluno(ArrayList<Aluno> lista){
        Scanner ler = new Scanner(System.in);
        System.out.println("-- Criar novo Aluno --");
        
        System.out.println("Qual eh o seu nome: ");
        String novoNome = ler.nextLine();
        Aluno novoAluno = new Aluno();
        novoAluno.nome = novoNome;
        lista.add(novoAluno);
        System.out.println("... aluno criado com sucesso");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        ArrayList<Aluno> lista = new ArrayList<>();
        carregarAlunosFich(lista);
        do {
            System.out.println("+-------------------------+");
            System.out.println("|  -- Gestao de Alunos -- |");
            System.out.println("+-------------------------+");
            System.out.println("| 1 - criar novo aluno    |");
            System.out.println("| 2 - remover um aluno    |");
            System.out.println("| 3 - atualizar  aluno    |");
            System.out.println("| 4 - listar todos aluno  |");
            System.out.println("| 5 - guardar no ficheiro |");
            System.out.println("+-------------------------+");
            System.out.println("| 0 - sair do programa    |");
            System.out.println("+-------------------------+");
            System.out.print("Escolha uma opcao: ");
            int opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                   criarAluno(lista);
                    break;
                case 2:
                    System.out.println("-- apagar aluno");
                    break;
                case 3:
                    System.out.println("-- atualizar aluno");
                    break;
                case 4:
                    listar(lista);
                    break;
                case 5:
                    System.out.println("-- guardar alunos ");
                    break;
                case 0: return;

                default:
                    System.out.println("Opcao invalida");

            }
        } while (true);

    }
}
