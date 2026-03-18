package main;

import java.util.Scanner;
import model.Usuario;
import service.UsuarioService;

public class MenuUsuario {
    public static Usuario iniciar(Scanner sc, UsuarioService usuarioService) {
        int op;

        do {
            System.out.println("\n==== SISTEMA ====\n");
            System.out.println("1 - Cadastrar usuario");
            System.out.println("2 - Login");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Nome:");
                String nome = sc.nextLine();

                System.out.println("Senha:");
                String senha = sc.nextLine();

                usuarioService.cadastrarUsuario(nome, senha);
            }

            if (op == 2) {
                System.out.println("Nome:");
                String nome = sc.nextLine();

                System.out.println("Senha:");
                String senha = sc.nextLine();

                Usuario usuarioLogado = usuarioService.login(nome, senha);
                if (usuarioLogado != null) {
                    System.out.println("Login realizado!");
                    return usuarioLogado;
                }

                System.out.println("Usuario ou senha incorretos.");
            }
        } while (op != 0);

        return null;
    }
}
