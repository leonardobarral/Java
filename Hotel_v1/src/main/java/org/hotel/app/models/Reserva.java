package org.hotel.app.models;

import java.util.Date;

public class Reserva {
    private int id;
    private long CPF;
    private String nomeCompleto;
    private String telNumber;
    private String email;
    private int idade;
    private String dataDeCheckin;
    private String dataDeCheckout;
    private String tipoDeQuartoouNumerodoquarto;
    private String preferenciaDeCama;
    private int formaDePagamento;
    private int numeroDeHospedes;
    private String status;
    private String informacoesAdicionais;

    public Reserva(int id, long CPF, String nomeCompleto, String telNumber, String email, int idade, String dataDeCheckin, String dataDeCheckout, String tipoDeQuartoouNumerodoquarto, String preferenciaDeCama, int formaDePagamento, int numeroDeHospedes, String status, String informacoesAdicionais) {
        this.id = id;
        this.CPF = CPF;
        this.nomeCompleto = nomeCompleto;
        this.telNumber = telNumber;
        this.email = email;
        this.idade = idade;
        this.dataDeCheckin = dataDeCheckin;
        this.dataDeCheckout = dataDeCheckout;
        this.tipoDeQuartoouNumerodoquarto = tipoDeQuartoouNumerodoquarto;
        this.preferenciaDeCama = preferenciaDeCama;
        this.formaDePagamento = formaDePagamento;
        this.numeroDeHospedes = numeroDeHospedes;
        this.status = status;
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
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

    public String getDataDeCheckin() {
        return dataDeCheckin;
    }

    public void setDataDeCheckin(String dataDeCheckin) {
        this.dataDeCheckin = dataDeCheckin;
    }

    public String getDataDeCheckout() {
        return dataDeCheckout;
    }

    public void setDataDeCheckout(String dataDeCheckout) {
        this.dataDeCheckout = dataDeCheckout;
    }

    public String getTipoDeQuartoouNumerodoquarto() {
        return tipoDeQuartoouNumerodoquarto;
    }

    public void setTipoDeQuartoouNumerodoquarto(String tipoDeQuartoouNumerodoquarto) {
        this.tipoDeQuartoouNumerodoquarto = tipoDeQuartoouNumerodoquarto;
    }

    public String getPreferenciaDeCama() {
        return preferenciaDeCama;
    }

    public void setPreferenciaDeCama(String preferenciaDeCama) {
        this.preferenciaDeCama = preferenciaDeCama;
    }

    public int getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(int formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getNumeroDeHospedes() {
        return numeroDeHospedes;
    }

    public void setNumeroDeHospedes(int numeroDeHospedes) {
        this.numeroDeHospedes = numeroDeHospedes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    @Override
    public String toString(){
        return  "{"+
            "'id':'" + id +
            "','CPF':'" +  CPF +
            "','nomeCompleto':'" +  nomeCompleto +
            "','telNumber':'" +  telNumber +
            "','email':'" +  email +
            "','idade':'" +  idade +
            "','dataDeCheckin':'" +  dataDeCheckin +
            "','dataDeCheckout':'" +  dataDeCheckout +
            "','tipoDeQuartoouNumerodoquarto':'" +  tipoDeQuartoouNumerodoquarto +
            "','preferenciaDeCama':'" +  preferenciaDeCama +
            "','formaDePagamento':'" +  formaDePagamento +
            "','numeroDeHospedes':'" +  numeroDeHospedes +
            "','Status':'" +  status +
            "','informacoesAdicionais':'" +  informacoesAdicionais+
            "'}";
    };


}
