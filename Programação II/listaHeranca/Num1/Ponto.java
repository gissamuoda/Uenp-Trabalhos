package exercicios.listaHeranca.Num1;

public class Ponto {
    private int x;
    private int y;

    public Ponto(){
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int eixoX, int eixoY){
        this.setX(eixoX);
        this.setY(eixoY);
    }

    public void setX(int eixoX){
        this.x = eixoX;
    }

    public int getX(){
        return x;
    }

    public void setY(int eixoY){
        this.y = eixoY;
    }

    public int getY(){
        return y;
    }

    @Override
    public String toString(){
        return "("+x+", "+y+")";
    }
}
