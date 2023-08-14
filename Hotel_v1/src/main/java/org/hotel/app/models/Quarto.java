package org.hotel.app.models;

public class Quarto {
    private int id;
    private String tipo;
    private String andar;
    private String status;
    private int numeroMaximoDeHospedes;

    public Quarto(int id, String tipo, String andar, String status, int numeroMaximoDeHospedes) {
        this.id = id;
        this.tipo = tipo;
        this.andar = andar;
        this.status = status;
        this.numeroMaximoDeHospedes = numeroMaximoDeHospedes;
    }

    public int getNumero() {
        return id;
    }

    public void setNumero(int numero) {
        this.id = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumeroMaximoDeHospedes() {
        return numeroMaximoDeHospedes;
    }

    public void setNumeroMaximoDeHospedes(int numeroMaximoDeHospedes) {
        this.numeroMaximoDeHospedes = numeroMaximoDeHospedes;
    }

    @Override
    public String toString(){
        return "{" +
                "'id':'" + id +
                "','tipo':'" + tipo+
                "','andar':'" + andar+
                "','status':'" + status+
                "','numeroMaximoDeHospedes':'" + numeroMaximoDeHospedes+
                "'}";
    }

}
