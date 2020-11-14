package exercicios.listaExercicios2.Num4;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        
        Aluno al = new Aluno("Sheldon", 1, 9.9, "Física");
        l.insert(al);

        l.printList();

        al = new Aluno("Leonard", 2, 8.9, "Física Experimental");
        l.insert(al);
        al = new Aluno("Howard", 3, 7.9, "Engenharia Mecatronica");
        l.insert(al);
        al = new Aluno("Rajesh", 4, 8.9, "Astrofísica");
        l.insert(al);
        al = new Aluno("Penny", 5, 5.9, "Artes cenicass");
        l.insert(al);

        l.printList();

    }
}
