package Revisao;

public class Lista {

    private final int MAX = 100;
    private int nAtualAlunos = 0;
    private Aluno[] lista;

    public Lista() {
        lista = new Aluno[MAX];
    }

    /*Retorna true  se lista vazia, false caso contrário*/
    public boolean vazia() {
        return nAtualAlunos == 0;
    }

    public boolean cheia() {
        /*Retorna true se lista cheia, false caso contrário*/
        return nAtualAlunos == 100;
    }

    public void apagarLista() {
        lista = new Aluno[MAX];
    }

    public boolean insereAlunoIndice(Aluno aluno, int indice) {
        if ((indice <= 100 & indice > 0) & !cheia()) {
            lista[indice - 1] = aluno;
            nAtualAlunos++;
            return true;
        }
        return false;
    }

    public static class Aluno {

        private String nome;
        private int cpf;

        Aluno(String _nome, int _cpf) {
            nome = _nome;
            cpf = _cpf;
        }

    }

    public static void main(String[] args) {
        Lista l1 = new Lista();
        Aluno tomas = new Aluno("Tomás", 171);
        System.out.println("Teste lista vazia: " + l1.vazia());
        l1.insereAlunoIndice(tomas, 1);
        System.out.println("Teste lista vazia: " + l1.vazia());
        System.out.println("Teste lista cheia: "+ l1.cheia());
        
    }

}
