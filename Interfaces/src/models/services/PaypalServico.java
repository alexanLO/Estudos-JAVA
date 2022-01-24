package models.services;

public class PaypalServico implements PagamentoOnlineServico {

    private static final double TAXA = 0.02;
    private static final double JUROS_MENSAL = 0.01;
    

    @Override
    public Double taxa(Double quantia) {
        return quantia * TAXA;
    }

    @Override
    public Double pagamentoMensal(Double quantia, Integer meses) {
        return quantia * meses * JUROS_MENSAL;
    }

}
