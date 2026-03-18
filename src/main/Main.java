package main;

import java.util.Scanner;
import model.Livro;
import model.Usuario;
import service.Biblioteca;
import service.UsuarioService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        UsuarioService usuarioService = new UsuarioService();
        Usuario usuarioLogado = MenuUsuario.iniciar(sc, usuarioService);

<<<<<<< HEAD
        if (usuarioLogado != null) {
            menuBiblioteca(sc, biblioteca, usuarioLogado);
        }

        sc.close();
    }

    public static void menuBiblioteca(Scanner sc, Biblioteca biblioteca, Usuario usuarioLogado) {
=======
        Usuario usuarioLogado = null;

        System.out.println("===LOGIN====");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Senha: ");
        String senha = sc.nextLine();

        usuarioLogado = new Usuario(nome,senha);

        System.out.println("Login realizado!\n");

        menuBiblioteca(sc, biblioteca, usuarioLogado);

}
    public static void menuBiblioteca(Scanner sc, Biblioteca biblioteca, Usuario usuarioLogado){
>>>>>>> 0fad0c040dfe80f50ce70f6dbeee339fd3f0bff5
        int op;

        do {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Listar emprestimos");
            System.out.println("0 - Logout");

            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Titulo:");
                String titulo = sc.nextLine();

                System.out.println("Autor:");
                String autor = sc.nextLine();

                biblioteca.adicionarLivro(new Livro(titulo, autor));
            }

            if (op == 2) {
                biblioteca.listarLivros();
            }

            if (op == 3) {
                System.out.println("ID:");
                int id = sc.nextInt();
                sc.nextLine();

                biblioteca.emprestarLivro(id, usuarioLogado);
            }

            if (op == 4) {
                System.out.println("ID:");
                int id = sc.nextInt();
                sc.nextLine();

                biblioteca.devolverLivro(id);
            }

            if (op == 5) {
                biblioteca.listarEmprestimos();
            }
        } while (op != 0);
    }
}
