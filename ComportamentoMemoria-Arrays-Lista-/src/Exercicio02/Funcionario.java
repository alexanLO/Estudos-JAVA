package Exercicio02;

public class Funcionario {
    private Integer id;
    private String name;
    private double salario;

    public Funcionario(){}

    public Funcionario(int id, String name, double salario){
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public void incrementoSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalario() {
        return salario;
    }
}
