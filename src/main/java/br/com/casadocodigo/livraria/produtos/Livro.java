package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;
import org.jetbrains.annotations.NotNull;

public abstract class Livro implements Produto { // Sendo abstrato o Livro se torna apenas uma abstração de tudo que os diferentes tipos de livros devem ter em nossa livraria

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public boolean isImpresso() {return impresso;}

    public void setImpresso(boolean impresso) {this.impresso = impresso;}

    public Autor getAutor() {return autor;}

    public void setAutor(Autor autor) {this.autor = autor;}

    public String getIsbn() {return isbn;}

    public void setIsbn(String isbn) {this.isbn = isbn;}

    public double getValor() {return valor;}

    public void setValor(double valor) {this.valor = valor;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public void mostrarDetalhes() {
        System.out.println("Livro: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("---");
    }


    private boolean temAutor() {
        return this.autor != null;
    }

    public abstract boolean aplicaDescontoDe(double porcentagem); //Classe abstrata

    public Livro(@NotNull Autor autor){
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

    @Override
    public int compareTo(Produto outro){
        if(this.getValor() < outro.getValor()){
            return 0;
        }
        if (this.getValor() > outro.getValor()){
            return 0;
        }
        return 0;
    }

}
