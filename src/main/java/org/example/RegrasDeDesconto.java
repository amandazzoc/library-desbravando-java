package org.example;

public class RegrasDeDesconto {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new MiniLivro(autor); //Não tem desconto
        livro.setValor(39.90);

        if(!livro.aplicaDescontoDe(0.3)){
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
