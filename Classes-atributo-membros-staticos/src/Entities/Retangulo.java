package Entities;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return (largura + altura) * 2;
    }

    public double diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
       
    }

    public double getLargura() {
        return largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
}
