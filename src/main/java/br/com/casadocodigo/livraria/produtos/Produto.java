package br.com.casadocodigo.livraria.produtos;

public interface Produto extends Comparable<Produto>{ //Colocar o generics elimina a necessidade de fazer casting de Object, que é o tipo de parâmetro de ser método iny compareTo(Object)

    double getValor(); // Todo método sem corpo de uma interfáce é abstrata, dessa forma não é necessário colocar "abstract" e nem "public" pois seus métodos já são públicos por padrão

}
