package service;

import java.util.ArrayList;
import model.Livro;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>(); // lista que só guarda obj do tipo livro

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

    public void emprestLivro(int id){

        Livro livro = livros.get(id);

        if(livro.isDisponivel()){
            livro.emprestar();
            System.out.println("Livro emprestado!");
        }else{
            System.out.println("Livro indisponível.");
        }

    }
    public void devolverLivro(int id){
        Livro livro = livros.get(id);
        livro.devolver();

        System.out.println("Livro Devolvido!");
    }
}
