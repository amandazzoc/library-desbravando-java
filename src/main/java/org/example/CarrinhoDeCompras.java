package org.example;

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Livro livro){ // Por LivroFisico e Ebook serem "filhos" de Livro então o método recebendo o Livro como parâmetro automaticamente vai aceitar os filhos dele, caso contrário seria necessário fazer um método pra cada tipo de livro (Polimorfismo)

        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.15);
        total += livro.getValor();
    }

    public double getTotal(){
        return total;
    }

}
