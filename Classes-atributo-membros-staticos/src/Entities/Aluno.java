package Entities;

public class Aluno {
    public String name;
    public double trimestre1;
    public double trimestre2;
    public double trimestre3;

    
    public double notaFinal() {
        return trimestre1 + trimestre2 + trimestre3;
    }

    public double pontosPerdido() {
        if(notaFinal() < 60.0){
            return notaFinal() - 60.0;
        }else {
            return 0.0;
        }
    }


}
