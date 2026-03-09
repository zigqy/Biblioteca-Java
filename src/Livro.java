public class Livro {
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo; // melhor para diferenciar do construtor
        this.autor = autor; // melhor para diferenciar do construtor
        this.disponivel = true; // melhor para diferenciar do construtor
    }
    public void mostrarInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponível: " + disponivel);
        System.out.println("--------------------");
    }
}
