package model;

public class Livro {
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo; // melhor para diferenciar do construtor
        this.autor = autor; // melhor para diferenciar do construtor
        this.disponivel = true; // melhor para diferenciar do construtor
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    public void emprestar(){
        disponivel = false;
    }
    public void devolver(){
        disponivel = true;
    }
}
