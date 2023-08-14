package org.hotel.app.models;

public class Hospede {
    private long cpf;
    private String nome;
    private String telNumber;
    private String email;
    private int idade;
    private long idResponsavel;

    public Hospede(long cpf, String nome, String telNumber, String email, int idade, long idResponsavel) {
        this.cpf = cpf;
        this.nome = nome;
        this.telNumber = telNumber;
        this.email = email;
        this.idade = idade;
        this.idResponsavel = idResponsavel;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(long idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    @Override
    public String toString(){
        return "{" +
                "'Cpf':'"+ cpf+
                "','nome':'" + nome +
                "','telNumber':'" + telNumber+
                "','email':'" + email +
                "','idade':'" + idade +
                "','idResponsavel':'" + idResponsavel+
                "'}";
    }


}
