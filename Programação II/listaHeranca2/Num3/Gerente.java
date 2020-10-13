package exercicios.listaHeranca2.Num3;

public class Gerente extends Funcionario{
    private Double salarioMes; 

    public Gerente(){
        salarioMes = 0.0;
    }

    public Gerente(Double salarioM){
        setSalarioMes(salarioM);
    }

    public Double calcularSalario(){
        return (this.salarioMes + (this.salarioMes*0.1));
    }

    public void setSalarioMes(Double salarioM){
        this.salarioMes = salarioM;
    }

    public Double getSalarioMes(){
        return this.salarioMes;
    }
}
