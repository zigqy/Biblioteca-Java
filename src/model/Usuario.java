package model;

public class Usuario {
    private final String nome;
    private final String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public boolean verificarSenha(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
}
