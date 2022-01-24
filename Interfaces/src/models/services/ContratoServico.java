package models.services;

import java.util.Date;
import java.util.Calendar;

import models.entities.Contrato;
import models.entities.Prestacao;

public class ContratoServico {

    // Uma empresa deseja automatizar o processamento de seus contratos. O
    // processamento de
    // um contrato consiste em gerar as parcelas a serem pagas para aquele contrato,
    // com base no
    // número de meses desejado.

    private PagamentoOnlineServico pagamentoOnlineServico;

    public ContratoServico(PagamentoOnlineServico pagamentoOnlineServico) {
        this.pagamentoOnlineServico = pagamentoOnlineServico;
    }

    public void processoContrato(Contrato contrato, Integer meses) {
        double parcelaBasica = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {
            Date data = addMeses(contrato.getData(), i);
            double updateParcela = parcelaBasica + pagamentoOnlineServico.pagamentoMensal(parcelaBasica, i);
            double parcelaTotal = updateParcela + pagamentoOnlineServico.taxa(updateParcela);
            contrato.getPrestacoes().add(new Prestacao(data, parcelaTotal));
        }

    }

    private Date addMeses(Date data, int meses){
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, meses);
        return (Date) cal.getTime();
    }
}
