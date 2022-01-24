package models.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date dataVencimento;
    private Double quantia;

    public Prestacao(Date dataVencimento, Double quantia){
        this.dataVencimento = dataVencimento;
        this.quantia = quantia;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString(){
        return sdf.format(dataVencimento) + " - " + String.format("%.2f", quantia); 
    }
}
