package capitulo7;

import java.time.LocalDate;

public class CaminhaoBiTrem extends Caminhao {
    private Integer cargaAdicional;

    public CaminhaoBiTrem(){
        super();
        cargaAdicional = 0;
    }

    public CaminhaoBiTrem(
        String marca, Integer ano, Double valor, String placa, Integer capacity, Integer cargaAdicional
    ){
        super(marca, placa, ano, valor, capacity);
        this.cargaAdicional = cargaAdicional;
    }

    public Double calculaIpva(){
        if(LocalDate.now().getYear() - getAno() > 20){
            return 0.0;
        }
        return getAno()*0.045;
    }

    public void setCargaAdicional(Integer cA){
        this.cargaAdicional = cA;
    }

    public Integer getCargaAdicional(){
        return cargaAdicional;
    }
}