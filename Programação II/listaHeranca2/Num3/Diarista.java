package exercicios.listaHeranca2.Num3;

public class Diarista extends Funcionario{
    private Double salarioDia;
    private int diasTrabalho;

    public Diarista(){
        salarioDia = 0.0;
        diasTrabalho = 0;
    }

    public Diarista(Double salarioD, int dias){
        setSalarioDia(salarioD);
        setDiasTrabalho(dias);
    }
    
    public Double calcularSalario(){
        return (this.salarioDia * this.diasTrabalho);
    }

    public void setSalarioDia(Double salarioD){
        this.salarioDia = salarioD;
    }

    public Double getSalarioDia(){
        return this.salarioDia;
    }

    public void setDiasTrabalho(int dias){
        this.diasTrabalho = dias;
    }

    public int getDiasTrabalho(){
        return this.diasTrabalho;
    }
}
