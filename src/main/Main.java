package main;
import model.Usuario;
import service.Biblioteca;
import java.util.Scanner;
import model.Livro;
import service.usuarioService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        menuBiblioteca(sc, biblioteca);

}
    public static void menuBiblioteca(Scanner sc, Biblioteca biblioteca){
        int op;

        do{
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Listar emprestimo");
            System.out.println("0 - Logout");

            op = sc.nextInt();
            sc.nextLine();
            if(op==1){
                System.out.println("Título: ");
                String titulo = sc.nextLine();

                System.out.println("Autor: ");
                String autor = sc.nextLine();

                Livro livro = new Livro(titulo,autor);

                biblioteca.adicionarLivro(livro);
            }
            if(op==2){
                biblioteca.listarLivros();
            }
            if(op==3){
                System.out.println("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                Usuario usuario = new Usuario(" Zig ", "123");
                biblioteca.emprestarLivro(id, usuario);
            }
            if(op==4){
                System.out.println("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                biblioteca.devolverLivro(id);
            }
            if(op==5){
                biblioteca.listarEmprestimos();
            }
        }while(op != 0);
    }
}
