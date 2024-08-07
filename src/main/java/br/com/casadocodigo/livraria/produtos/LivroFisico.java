package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }

    @Override
    public String toString() {
        return "LivroFisico";
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.30){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no LivroFisico");
        return true;
    }
}
