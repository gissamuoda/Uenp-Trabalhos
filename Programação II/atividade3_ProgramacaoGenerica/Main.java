package exercicios.atividade3_ProgramacaoGenerica;

public class Main {
    public static void main(String[] args) {
        String frases[] = {
            "É preciso estudar volapuque",
            "é preciso estar sempre bêbado", 
            "é preciso ler Baudelaire", 
            "é preciso colher as flores", 
            "de que rezam velhos autores"
        };

        ContFrequencia test = new ContFrequencia(frases); 

        test.frequenciaPalavras();
        test.printWordsFrequency();
    }
}
