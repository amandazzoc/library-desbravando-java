package br.com.casadocodigo.livraria;

import br.com.casadocodigo.livraria.produtos.Produto;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona(@NotNull Produto produto){ // Por LivroFisico e Ebook serem "filhos" de Livro então o método recebendo o Livro como parâmetro automaticamente vai aceitar os filhos dele, caso contrário seria necessário fazer um método pra cada tipo de livro (Polimorfismo)
        this.produtos.add(produto);
    }

    public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public double getTotal(){
        return total;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }
}
