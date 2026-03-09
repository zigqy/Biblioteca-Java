import java.util.ArrayList;
public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>(); // lista que só guarda obj do tipo livro

    public void adicionarLivro(Livro livro){ // metodo p adicionar livros
        livros.add(livro);
    }
    public void listarLivros(){
        for(int i=0;i<livros.size();i++){
            System.out.println("ID: " + i);
            livros.get(i).mostrarInfo(); // pegar um elemento da lista(pegar um livro)

        }

    }

    public void emprestLivro(int id){
        if(livros.get(id).disponivel){ // aqui ele vai pegar o ID, e dps verificar se tem ou não no sistema, se sim, pega
            //se não, dá indisponivel
            livros.get(id).disponivel = false;
            System.out.println("Livro emprestado!");
        }else{
            System.out.println("Livro indisponível.");
        }

    }

}
