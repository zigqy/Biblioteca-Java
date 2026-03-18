package service;

import java.util.ArrayList;
import java.util.List;
import model.Emprestimo;
import model.Livro;
import model.Usuario;

public class Biblioteca {
    private final List<Livro> livros = new ArrayList<>();
    private final List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            System.out.println("Livro invalido.");
            return;
        }

        livros.add(livro);
        System.out.println("Livro adicionado com sucesso.");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            System.out.println("ID: " + i);
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Disponivel: " + livro.isDisponivel());
            System.out.println("------------------");
        }
    }

    public void emprestarLivro(int id, Usuario usuario) {
        if (!idValido(id)) {
            System.out.println("ID de livro invalido.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuario invalido.");
            return;
        }

        Livro livro = livros.get(id);
        if (!livro.isDisponivel()) {
            System.out.println("Livro indisponivel.");
            return;
        }

        livro.emprestar();
        emprestimos.add(new Emprestimo(usuario, livro));
        System.out.println("Livro emprestado para " + usuario.getNome() + ".");
    }

    public void devolverLivro(int id) {
        if (!idValido(id)) {
            System.out.println("ID de livro invalido.");
            return;
        }

        Livro livro = livros.get(id);
        if (livro.isDisponivel()) {
            System.out.println("Esse livro ja esta disponivel.");
            return;
        }

        livro.devolver();
        removerEmprestimoDoLivro(livro);
        System.out.println("Livro devolvido!");
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum emprestimo registrado.");
            return;
        }

        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
            System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
            System.out.println("Data: " + emprestimo.getDataEmprestimo());
            System.out.println("-------------");
        }
    }

    private boolean idValido(int id) {
        return id >= 0 && id < livros.size();
    }

    private void removerEmprestimoDoLivro(Livro livro) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getLivro() == livro) {
                emprestimos.remove(i);
                return;
            }
        }
    }
}
