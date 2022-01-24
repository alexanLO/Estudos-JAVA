package models.services;

public interface PagamentoOnlineServico {
    

    public Double taxa(Double quantia);

    public Double pagamentoMensal(Double quantia, Integer meses);
}
