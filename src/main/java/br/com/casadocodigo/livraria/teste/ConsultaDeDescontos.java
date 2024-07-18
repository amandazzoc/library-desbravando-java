package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.GerenciadorDeCupons;

public class ConsultaDeDescontos {
    public static void main(String[] args) {

        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        if(gerenciador.validaCupom("CUP1")){
            System.out.println("Cupom de desconto valido.");
        } else {
            System.out.println("Esse cupom não existe.");
        }
    }
}
