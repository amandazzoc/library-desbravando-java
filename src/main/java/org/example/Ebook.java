package org.example;

public class Ebook extends Livro{

    private String waterMark;

    public Ebook(Autor autor){
        super(autor); //Delega a responsabilidade para a *superclasse* que é Livro
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override // Mostra que o método é reescrito, no caso o mesmo método está na superclasse Livro
    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.15){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Aplicando desconto no Ebook");
        return true;
    }
}
