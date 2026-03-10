public class Usuario {
    private String name;
    private String senha;

    public Usuario(String nome, String senha){
        this.name = nome;
        this.senha = senha;
    }
    public String getName(){
        return name;
    }
    public boolean verificarSenha(String senhaDigitada){
        return this.senha.equals(senhaDigitada);
    }
}
