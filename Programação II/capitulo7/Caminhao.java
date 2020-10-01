package capitulo7;

import java.time.LocalDate;

public class Caminhao extends Veiculo {
    private Integer capacity;

    public Caminhao(){
        this.setAno(0);
        this.setValor(0.0);
        this.setMarca("");
        this.setPlaca("");
        this.setCapacity(0);
    }

    public Caminhao(
        String marca, String placa, Integer ano, Double valor, Integer capacity
    ){
        super(marca, placa, ano, valor);
        this.capacity = capacity;
    }

    public Double calculaIpva(){
        Integer anoAtual = LocalDate.now().getYear();
        Integer idade = anoAtual - getAno();
        if(idade > 20){
            return 0.0;
        }else{
            return getValor()*0.4;
        }
    }

    public Integer getCapacity(){
        return capacity;
    }

    public void setCapacity(Integer c){
        this.capacity = c;
    }

}
