package capitulo7;

public class Veiculo {
    private String marca;
    private Integer ano; 
    private Double valor; 
    private String placa;

    public Veiculo(){
        marca = "";
        ano = 0; 
        valor = 0.0;
        placa = "";
    }

    public Veiculo(String marca, String placa, Integer ano, Double valor){
        this.marca = marca;
        this.ano = ano; 
        this.valor = valor;
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public Integer getAno(){
        return ano;
    }

    public void setAno(Integer a){
        this.ano = a;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double v){
        this.valor = v;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString(){
        return "Marca: "+marca+" | Placa: "+placa+" | Ano: "+ano+" | Valor: "+valor;
    }

    @Override
    public boolean equals(Object obj){
        return(this.getPlaca() == obj); 
    }
}
