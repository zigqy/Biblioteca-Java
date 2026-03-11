package main;

import service.Biblioteca;
import java.util.Scanner;
import model.Livro;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int op;

        do{
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            if(op == 1 ){
                System.out.println("Título: ");
                String titulo = sc.nextLine();

                System.out.println("Autor: ");
                String autor = sc.nextLine();

                Livro livro = new Livro(titulo, autor);

                biblioteca.adicionarLivro(livro);
            }
            if(op==2){
                biblioteca.listarLivros();
            }
            if(op==3){
                System.out.println("Digite o ID do livro: ");
                int id =sc.nextInt();

                biblioteca.emprestLivro(id);
            }
            if(op==4){
                System.out.println("Digite o ID do livro: ");
                int id = sc.nextInt();

                biblioteca.devolverLivro(id);
            }

        }while(op != 0);
    }
}
