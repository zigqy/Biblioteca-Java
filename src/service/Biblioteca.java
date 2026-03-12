package service;

import model.Usuario;
import java.util.ArrayList;
import model.Livro;
import  model.Emprestimo;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>(); // lista que só guarda obj do tipo livro
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro){ // metodo p adicionar livros
        livros.add(livro);
    }

    public void listarLivros(){
        for(int i=0;i<livros.size();i++){
            Livro l = livros.get(i);

            System.out.println("ID: " + i);
            System.out.println("Título: " + l.getTitulo());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Disponível: " + l.isDisponivel());
            System.out.println("------------------");
        }

    }

    public void emprestarLivro(int id, Usuario usuario){
        Livro livro = livros.get(id);

        if(livro.isDisponivel()){
            livro.emprestar();
            Emprestimo emprestimo = new Emprestimo(usuario, livro);

            emprestimos.add(emprestimo);
            System.out.println("Livro emprestado para" + usuario.getName());
        }else{
            System.out.println("Livro indisponível.");
        }
    }
    public void devolverLivro(int id){
        Livro livro = livros.get(id);
        livro.devolver();

        System.out.println("Livro Devolvido!");
    }
    public void listarEmprestimos(){
        if(emprestimos.size() == 0){
            System.out.println("Nenhum emprestimo registrado.");
            return;
        }
        for(Emprestimo e : emprestimos){
            System.out.println("Usuario: " + e.getUsuario().getName());
            System.out.println("Livro: " + e.getLivro().getTitulo());
            System.out.println("Data: " + e.getDataEmprestimo());
            System.out.println("-------------");
        }
    }
}
