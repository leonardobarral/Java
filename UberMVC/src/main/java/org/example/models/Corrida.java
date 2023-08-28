package org.example.models;

public class Corrida {
    private String origem;
    private String destino;
    private int duracao;
    private double valor;
    private double distancia;
    private TipoCorrida tipo;
    private String motorista;
    private String passageiro;

    public Corrida() {
    }

    public Corrida(String origem, String destino, int duracao, double valor, double distancia, TipoCorrida tipo, String motorista, String passageiro) {
        this.origem = origem;
        this.destino = destino;
        this.duracao = duracao;
        this.valor = valor;
        this.distancia = distancia;
        this.tipo = tipo;
        this.motorista = motorista;
        this.passageiro = passageiro;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public TipoCorrida getTipo() {
        return tipo;
    }

    public void setTipo(TipoCorrida tipo) {
        this.tipo = tipo;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(String passageiro) {
        this.passageiro = passageiro;
    }
}
