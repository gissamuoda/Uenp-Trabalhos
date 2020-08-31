package Ponteiros;

public class CarroF1 {
    String equipe;
    String fabricanteMotor;
    String pneus;
    String corPredominante;
    String piloto1;
    String piloto2;
    float peso;

    public String imprimir(){
        return equipe+" / motor: "+fabricanteMotor+" / pneus: "+pneus+" / cor: "+corPredominante+" / piloto1: "+piloto1+" & piloto2: "+piloto2+"/ peso: "+peso;
    }

    public void cadastra(String eq, String fab, String pn, String cor, String piloto1, String piloto2, float peso){
        this.equipe = eq;
        this.fabricanteMotor = fab;
        this.pneus = pn;
        this.corPredominante = cor;
        this.piloto1 = piloto1;
        this.piloto2 = piloto2;
        this.peso = peso;
    }
}