package exercicios.atividade3_ProgramacaoGenerica;

import java.util.HashMap;
import java.util.Map;

public class ContFrequencia {
    private String splitingString[];
    private Map<String, Integer> words = new HashMap<>();

    public ContFrequencia(String[] frases){
        this.splitingString = frases;
    }

    public void frequenciaPalavras(){
        for(int i = 0; i < this.splitingString.length; i++){
            String splitedString[] = this.splitingString[i].split(" ");
            for(int j = 1; j < splitedString.length; j++){
                this.words.put(splitedString[0], 1);
                for(Map.Entry<String, Integer> entry: this.words.entrySet()){
                    if (entry.getKey() == splitedString[j]){
                        Integer newValue = entry.getValue()+1;
                        this.words.replace(entry.getKey(), entry.getValue(), newValue);
                    } else{
                        this.words.put(splitedString[j], 1);
                    }
                }
            }
        }
    }

    public void printWordsFrequency(){
        for(Map.Entry<String, Integer> entryPrint : this.words.entrySet()){
            System.out.println("key: "+entryPrint.getKey()+" | value: "+entryPrint.getValue());
        }
    }
}
