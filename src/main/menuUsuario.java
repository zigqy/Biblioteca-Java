package main;
import java.util.Scanner;
import model.Usuario;
import service.usuarioService;

public class menuUsuario {
    public static Usuario iniciar(Scanner sc, usuarioService  usuarioService){
        int op;
        Usuario usuariologado = null;

        do {
            System.out.println("\n====SISTEMA====\n");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Login");
            System.out.println("0 - Sair");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Nome:");
                String nome = sc.nextLine();

                System.out.println("Senha");
                String senha = sc.nextLine();

                usuarioService.cadastrarUsuario(nome, senha);
            }
            if (op == 2) {
                System.out.println("Nome:");
                String nome = sc.nextLine();

                System.out.println("Senha:");
                String senha = sc.nextLine();

                usuariologado = usuarioService.login(nome, senha);

                if (usuariologado != null) {
                    System.out.println("Login realizado!");
                    return usuariologado;
                } else {
                    System.out.println("Usuario ou senha incorretos");
                }
            }
        }while(op != 0);
        return null;
        }

    }

