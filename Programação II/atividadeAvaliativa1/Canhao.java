package exercicios.atividadeAvaliativa1;

public class Canhao {
    float angulo;
    int forca;

    Canhao(){
        angulo = 0;
        forca = 0;
    }

    void cannonShoot(){
        System.out.println("Atirou em: angulo= " + angulo + " - alcance= " + forca);
    }

    void ajustarAngulo(float angulo){
        this.angulo = angulo;
    }

    void ajustarAlcance(int alcance){
        forca = alcance;
    }

    public static void main(String[] args) {
        Canhao x = new Canhao();

        x.ajustarAlcance(70);
        x.ajustarAngulo(0);

        x.cannonShoot();
    }
}