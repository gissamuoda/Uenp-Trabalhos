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
        String splitedString[];
        Integer oldValue = 0; 
        Integer newValue = 0;
        int equal = 0;

        for(int i = 0; i < this.splitingString.length; i++){
            splitedString = this.splitingString[i].split(" ");
            for(int j = 0; j < splitedString.length; j++){
                for(Map.Entry<String, Integer> entry: this.words.entrySet()){
                    if (entry.getKey().equals(splitedString[j].toLowerCase())){
                        oldValue = entry.getValue();
                        newValue = (entry.getValue()+1);
                        equal = 1;
                    } 
                }
                if(equal == 1){
                    this.words.replace(splitedString[j].toLowerCase(), oldValue, newValue);
                }else{
                    this.words.put(splitedString[j].toLowerCase(), 1);
                }
                equal = 0;
            }
        }
    }

    public void printWordsFrequency(){
        for(Map.Entry<String, Integer> entry : this.words.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }

    public void setSplitingString(String[] str){
        this.splitingString = str;
    }

    public String[] getSplitingString() {
        return this.splitingString;
    }
}
