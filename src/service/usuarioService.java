package service;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioService {
    private final List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(String nome, String senha) {
        if (nome == null || nome.isBlank() || senha == null || senha.isBlank()) {
            System.out.println("Nome e senha sao obrigatorios.");
            return;
        }

        if (buscarPorNome(nome) != null) {
            System.out.println("Ja existe um usuario com esse nome.");
            return;
        }

        usuarios.add(new Usuario(nome, senha));
        System.out.println("Usuario cadastrado!");
    }

    public Usuario login(String nome, String senha) {
        Usuario usuario = buscarPorNome(nome);
        if (usuario != null && usuario.verificarSenha(senha)) {
            return usuario;
        }

        return null;
    }

    private Usuario buscarPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }

        return null;
    }
}
