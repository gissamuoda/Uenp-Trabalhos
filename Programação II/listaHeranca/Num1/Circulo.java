package exercicios.listaHeranca.Num1;

public class Circulo {
    Ponto ponto = new Ponto();
    private int raio;

    public Circulo(){
        ponto = null;
        raio = 0;
    }

    public Circulo(Ponto ponto, int raio){
        setPonto(ponto);
        setRaio(raio);
    }

    public void setRaio(int raio){
        this.raio = raio;
    }

    public int getRaio(){
        return raio;
    }

    public void setPonto(Ponto ponto){
        this.ponto = ponto;
    }

    public Ponto getPonto(){
        return ponto;
    }

    @Override
    public String toString(){
        return "Coordenadas: "+ponto.toString()+" |Raio: "+raio;
    }
}
