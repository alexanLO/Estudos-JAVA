package models.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    
    private Integer numero;
    private Date data;
    private Double valorTotal;

    private List<Prestacao> prestacoes = new ArrayList<>();
    
    public Contrato(int numero, Date data, double valorTotal) {
        this.setNumero(numero);
        this.setData(data);
        this.setValorTotal(valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Prestacao> getPrestacoes() {
        return prestacoes;
    }
}
