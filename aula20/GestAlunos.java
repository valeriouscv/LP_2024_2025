package aula20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestAlunos {
    public static void carregarFicheiro(ArrayList<Aluno> lista) throws FileNotFoundException {
        File ficheiro = new File("alunos.txt");
        if (ficheiro.exists()) {
            Scanner ler = new Scanner(ficheiro);
            while (ler.hasNextLine()) {
                String linha = ler.nextLine();
                // separar a linha por virgula
                String[] sep = linha.split(",");
                Aluno aluno = new Aluno();
                aluno.nome = sep[0]; // sep[0] -> nome
                aluno.idade = Integer.parseInt(sep[1]); // sep[1] -> idade
                aluno.sexo = sep[2]; // sep[2] -> sexo
                lista.add(aluno);
            }
            ler.close();
        }
    }

    public static void listarTodosAlunos(ArrayList<Aluno> lista) {
        if (lista.isEmpty()) {
            System.out.println("-- a lista encontra-se vazia --");
        } else {
            System.out.println("--> Lista de Alunos <--");
            /*
             * for (Aluno aluno : lista) {
             * System.out.println("aluno: "+aluno.nome);
             * }
             */
            for (int i = 0; i < lista.size(); i++) {
                Aluno aluno = lista.get(i);
                System.out.println(aluno.nome + "," + aluno.idade + " anos, sexo " + aluno.sexo);
            }
        }
    }

    public static void eliminarAluno(ArrayList<Aluno> lista) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Indique o nome do aluno a eliminar: ");
        String nomeAluno = ler.nextLine();
        boolean sinal = false;
        // percorrer a lista toda
        for (int i = 0; i < lista.size(); i++) {
            // obter cada aluno da lista
            Aluno aluno = lista.get(i);
            if (nomeAluno.equals(aluno.nome)) {
                lista.remove(i);
                sinal = true;
                System.out.println("o aluno " + nomeAluno + " foi removido com sucesso");
                return;
            }
        }
        if (!sinal) {
            System.out.println("o aluno " + nomeAluno + " nao foi encontrado");
        }
        ler.close();

    }

    public static void guardarFicheiro(ArrayList<Aluno> lista) throws FileNotFoundException {
        File ficheiro = new File("alunos.txt");
        PrintWriter escrita = new PrintWriter(ficheiro);
        for (int i = 0; i < lista.size(); i++) {
            Aluno aluno = lista.get(i);
            escrita.println(aluno.nome + "," + aluno.idade + "," + aluno.sexo);
        }
        escrita.close();
        System.out.println("--> ficheiro foi guardado com sucesso");
    }

    public static void criarNovoAluno(ArrayList<Aluno> lista) {
        Scanner ler = new Scanner(System.in);
        Aluno novoAluno = new Aluno();
        System.out.println("--> novo aluno <--");

        System.out.print("nome: ");
        novoAluno.nome = ler.nextLine();
        System.out.print("idade: ");

        novoAluno.idade = ler.nextInt();
        ler.nextLine(); // limpar o buffer do teclado

        System.out.print("sexo: ");
        novoAluno.sexo = ler.nextLine();
        // colocar o novo aluno na list
        lista.add(novoAluno);
        System.out.println(novoAluno.nome + " foi criado com sucesso\n");
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Aluno> lista = new ArrayList<>();
        carregarFicheiro(lista);
        criarNovoAluno(lista);
        criarNovoAluno(lista);
        // eliminarAluno(lista);
        // listarTodosAlunos(lista);
        guardarFicheiro(lista);
    }
}
