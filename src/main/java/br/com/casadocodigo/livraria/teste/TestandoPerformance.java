package br.com.casadocodigo.livraria.teste;

import java.util.ArrayList;
import java.util.List;

public class TestandoPerformance {

    public static void main(String[] args) {

        List<String> colecao = new ArrayList<String>();

        for (int i = 0; i < 100000; i++) {
            colecao.add("Item"+i);
        }

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            colecao.contains("Item"+i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Demorou "+ tempo +" MS para executar");
    }
}
