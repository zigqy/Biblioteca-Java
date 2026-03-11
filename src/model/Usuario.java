package model;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    public String getName(){
        return nome;
    }

    public boolean verificarSenha(String senhaDigitada){
        return this.senha.equals(senhaDigitada);
    }
}
