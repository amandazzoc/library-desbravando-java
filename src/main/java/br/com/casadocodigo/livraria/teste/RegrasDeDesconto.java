package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico livro = new LivroFisico(autor); //Não tem desconto
        livro.setValor(39.90);

        if(!livro.aplicaDescontoDe(0.30)){
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if(!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto não pode ser maior do que 10%");
        } else {
            System.out.println("Valor com desconto: " + ebook.getValor());
        }
    }
}
