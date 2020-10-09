package exercicios.listaHeranca.Num1;

public class Pixel extends Ponto{
    private String color;

    public Pixel(int eixoX, int eixoY, String color){
        super(eixoX, eixoY);
        this.setColor(color);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
