package exercicios.listaExercicios2.Num4;

public class Aluno {
    String nomeAluno;
    int matricula;
    double coefRend;
    String nomeCurso;

    Aluno proximo;
    Aluno anterior;

    public Aluno(String nome, int matri, double d, String curso){
        this.nomeAluno = nome;
        this.matricula = matri;
        this.coefRend = d;
        this.nomeCurso = curso;
    }

    @Override 
    public String toString(){
        return "Nome: "+nomeAluno+" |Matricula: "+matricula+" |Coef. Rendimento: "+coefRend+" |Nome Curso: "+nomeCurso;
    }
}
