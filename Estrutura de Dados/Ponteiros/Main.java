package Ponteiros;

public class Main {
    public static void main(String[] args) {
        CarroF1 vet[] = new CarroF1[10];
        int pont = -1;
        
        CarroF1 prima = new CarroF1();
        prima.cadastra("Mercedes", "Mercedes 1.6 V6", "Pirelli", "Prata", "Hamilton", "Bottas", 650);
        pont = insereDado(vet, prima, pont);

        CarroF1 segundo = new CarroF1();
        segundo.cadastra("BWT", "Mercedes 1.6 V6", "Pirelli", "Rosa", "Perez", "Stroll", 655);
        pont = insereDado(vet, segundo, pont);

        CarroF1 terceiro = new CarroF1();
        terceiro.cadastra("Mclaren", "Renault 1.6 V6", "Pirelli", "Amarelo", "Sainz", "Norris", 650);
        pont = insereDado(vet, terceiro, pont);

        CarroF1 quarto = new CarroF1();
        quarto.cadastra("Renault", "Renault 1.6 V6", "Pirelli", "Preto", "Ricciardo", "Ocon", 645);
        pont = insereDado(vet, quarto, pont);

        CarroF1 quinto = new CarroF1();
        quinto.cadastra("Hass", "Ferrari1.6 V6", "Pirelli", "Branco", "Grosjean", "Magnussen", 660);
        pont = insereDado(vet, quinto, pont);

        CarroF1 sexto = new CarroF1();
        sexto.cadastra("Alpha Romeo", "Ferrari1.6 V6", "Pirelli", "Vermelho", "Raikkonen", "Giovinazzi", 640);
        pont = insereDado(vet, sexto, pont);

        CarroF1 setimo = new CarroF1();
        setimo.cadastra("Alpha Tauri", "Honda 1.6 V6", "Pirelli", "Preto Branco", "Kvyat", "Gasly", 640);
        pont = insereDado(vet, setimo, pont);

        CarroF1 oitavo = new CarroF1();
        oitavo.cadastra("Williams", "Mercedes 1.6 V6", "Pirelli", "Azul Vermelho", "Russel", "Latifi", 640);
        pont = insereDado(vet, oitavo, pont);

        CarroF1 nono = new CarroF1();
        nono.cadastra("Red Bull", "Honda 1.6 V6", "Pirelli", "Preto Vermelho", "Verstappen", "Albon", 630);
        pont = insereDado(vet, nono, pont);

        CarroF1 decimo = new CarroF1();
        decimo.cadastra("Ferrari", "Ferrari 1.6 V6", "Pirelli", "Vermelho", "Vettel", "Leclerc", 630);
        pont = insereDado(vet, decimo, pont);

        System.out.println("\n___________ Lista de Cadastro ___________");
        for(int i = 0; i <= pont; i++){
            System.out.println(i+" - "+vet[i].imprimir());
        }
        
        System.out.println("\n___________ Busca por Equipe ___________");
        int busc = busca("Ferrari", vet, pont);
        if(busc >= 0){
            System.out.println("Foi encontrado na posição: "+busc); 
        }else{
            System.out.println("Não foi encontrado");
        } 


        System.out.println("\n___________ Metodo de Remoção ___________");
        pont = removeDado(vet, pont, 1); // foi removido a posição 1(BWT)
        
        for(int i = 0; i <= pont; i++){
            System.out.println(i+" - "+vet[i].imprimir());
        }

        // Teste de inserção de um novo dado após a remoção
        System.out.println("\n_________________________________________");
        CarroF1 ultimo = new CarroF1();
        ultimo.cadastra("BWT", "Mercedes 1.6 V6", "Pirelli", "Rosa", "Perez", "Stroll", 655);
        pont = insereDado(vet, ultimo, pont);

        for(int i = 0; i <= pont; i++){
            System.out.println(i+" - "+vet[i].imprimir());
        }
        
    }

    //metodo de inserção no vetor
    public static int insereDado(CarroF1 vet[], CarroF1 d, int ponteiro){
        if(ponteiro < vet.length){
            ponteiro = ponteiro+1;
            vet[ponteiro] = d;
            System.out.println("inserindo");
            //System.out.println(" ponteiro: "+ponteiro);
        }else{
            System.out.println("Impossível inserir mais");
        }
        return ponteiro;
    }
    
    //metodo de remoção
    public static int removeDado(CarroF1 vet[], int pont, int posiDelete){
        for(int i = 0, j = 0; i <= pont; i++, j++){
            if(i == posiDelete){
                j++;
                pont--;
            }
            vet[i] = vet[j];
        }
        return pont;
    }
    
    // método de busca
    public static int busca(String buscado, CarroF1 vet[], int pont){
        for(int i = 0; i <= pont; i++) {
            if(vet[i].equipe.contains(buscado)){
                return i;
            }
        }
        return -1;
    }
}