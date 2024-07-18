package br.com.casadocodigo.livraria;

public class Autor {

    private String nome;
    private String email;
    private String cpf;

    public void mostrarDetalhes() {
        System.out.println("Autor: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Autor)) return false; //Se o parâmetro passado não for do tipo autor ele retorna false
        Autor outro = (Autor) obj; //Molda o objeto que é recebido como parâmetro pelo equals  para o tipo Autor (risco de ClassCastException)
        return this.nome.equals(outro.nome); //Ele compara o texto passado e não a referência de memória
    }
}
