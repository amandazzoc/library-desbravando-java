package br.com.casadocodigo.livraria;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GerenciadorDeCupons {

    private Map<String,Double> cupons;

    public GerenciadorDeCupons(){
        this.cupons = new HashMap<String>();
        cupons.addAll(Arrays.asList("CUP74", "CUP158","CUP14","CUP52","CUP21","CUP221","CUP91","CUP327","CUP410","CUP275","CUP484","CUP207", "CUP96","CUP119","CUP174","CUP291","CUP1","CUP115","CUP222","CUP272"));
    }

    public boolean validaCupom(String cupom) {
        return this.cupons.contains(cupom);
    }
}
