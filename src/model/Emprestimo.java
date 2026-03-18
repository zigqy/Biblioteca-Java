package model;

import java.time.LocalDate;

public class Emprestimo {
    private final Usuario usuario;
    private final Livro livro;
    private final LocalDate dataEmprestimo;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
}
