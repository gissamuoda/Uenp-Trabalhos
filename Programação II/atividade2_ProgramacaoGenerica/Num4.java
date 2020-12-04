package exercicios.atividade2_ProgramacaoGenerica;

public class Num4 {
    static public <T extends Number> Double parteFracionária(T numero){
        int pInteiro = numero.intValue();
        Double pFracionaria = numero.doubleValue() - pInteiro;
        
        return pFracionaria;
    }

    public static void main(String[] args) {
        System.out.println(Num4.parteFracionária(3.5));
        System.out.println(Num4.parteFracionária(0.5));
    }
}
