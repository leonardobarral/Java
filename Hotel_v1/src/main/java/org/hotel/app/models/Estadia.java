package org.hotel.app.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estadia {

    private int id;
    private Hospede hospedeResponsavel;
    private Reserva reservaRelacionada;
    private Date dataDeCheckin;
    private Date dtaDeCheckout;
    private int idDoQuarto;
    private int tipoDeCama;
    private int fornaDePagamento;
    private List<Hospede> hospedes = new ArrayList<>();
    private String status;
    private String informacoesAdicionais;
    private int valorPago;


    public Estadia(int id, Hospede hospedeResponsavel, Reserva reservaRelacionada, Date dataDeCheckin, Date dtaDeCheckout, int idDoQuarto, int tipoDeCama, int fornaDePagamento, List<Hospede> hospedes, String status, String informacoesAdicionais, int valorPago) {
        this.id = id;
        this.hospedeResponsavel = hospedeResponsavel;
        this.reservaRelacionada = reservaRelacionada;
        this.dataDeCheckin = dataDeCheckin;
        this.dtaDeCheckout = dtaDeCheckout;
        this.idDoQuarto = idDoQuarto;
        this.tipoDeCama = tipoDeCama;
        this.fornaDePagamento = fornaDePagamento;
        this.hospedes = hospedes;
        this.status = status;
        this.informacoesAdicionais = informacoesAdicionais;
        this.valorPago = valorPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hospede getHospedeResponsavel() {
        return hospedeResponsavel;
    }

    public void setHospedeResponsavel(Hospede hospedeResponsavel) {
        this.hospedeResponsavel = hospedeResponsavel;
    }

    public Reserva getReservaRelacionada() {
        return reservaRelacionada;
    }

    public void setReservaRelacionada(Reserva reservaRelacionada) {
        this.reservaRelacionada = reservaRelacionada;
    }

    public Date getDataDeCheckin() {
        return dataDeCheckin;
    }

    public void setDataDeCheckin(Date dataDeCheckin) {
        this.dataDeCheckin = dataDeCheckin;
    }

    public Date getDtaDeCheckout() {
        return dtaDeCheckout;
    }

    public void setDtaDeCheckout(Date dtaDeCheckout) {
        this.dtaDeCheckout = dtaDeCheckout;
    }

    public int getIdDoQuarto() {
        return idDoQuarto;
    }

    public void setIdDoQuarto(int idDoQuarto) {
        this.idDoQuarto = idDoQuarto;
    }

    public int getTipoDeCama() {
        return tipoDeCama;
    }

    public void setTipoDeCama(int tipoDeCama) {
        this.tipoDeCama = tipoDeCama;
    }

    public int getFornaDePagamento() {
        return fornaDePagamento;
    }

    public void setFornaDePagamento(int fornaDePagamento) {
        this.fornaDePagamento = fornaDePagamento;
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public void setHospedes(List<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public int getValorPago() {
        return valorPago;
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }
}

