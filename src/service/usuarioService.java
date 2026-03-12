package service;
import java.util.ArrayList;
import model.Usuario;

public class usuarioService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(String nome, String senha){
        Usuario u = new Usuario(nome, senha);
        usuarios.add(u);

        System.out.println("Usuário cadastrado!");
    }
    public boolean login(String nome, String senha){
        for(Usuario u : usuarios){
            if(u.getName().equals(nome) && u.verificarSenha(senha)){
                return true;
            }
        }
        return false;
    }
}
