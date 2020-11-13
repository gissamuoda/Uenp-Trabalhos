package exercicios.atividadeAvaliativa2;

public class Caixa {
    private int flag;
    
    Caixa(){
        this.flag = 0;
    }

    Caixa(int num){
        this.setFlag(num); 
    }

    public void setFlag(int num){
        this.flag = num;
    }

    public int getFlag(){
        return this.flag;
    }

    public static void zerar(Caixa box){
        box.setFlag(0);
    }
}
