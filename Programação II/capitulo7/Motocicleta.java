package capitulo7;

public class Motocicleta extends Veiculo{
    private Integer cilindradas;

    public Motocicleta(){
        this.cilindradas = 0;
    }

    public Motocicleta(
        String marca, Integer ano, Double valor, String placa, Integer cilindradas
    ){
        super(marca, placa, ano, valor);
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas){
        this.cilindradas = cilindradas;
    }
}
