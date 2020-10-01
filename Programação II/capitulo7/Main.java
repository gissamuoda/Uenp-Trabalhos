package capitulo7;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("ford", "abc-1234", 2013, 13000.00, 1200);
        Double ipva = caminhao.calculaIpva();
        System.out.println(ipva);

        Veiculo num1 = new Veiculo("marca", "abc-1234", 1999, 15000.00);

        boolean equals = caminhao.equals(num1.getPlaca());
        System.out.println(equals);
    
    }
}
