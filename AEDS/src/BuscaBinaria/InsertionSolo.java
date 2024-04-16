package BuscaBinaria;

public class InsertionSolo {

    public static void insertionSort(int vetor[]){
        int i, j, aux;
        for (i = 1;  i < vetor.length; i++) {
            j = i-1;
            aux = vetor[i];
            while(j>=0&&vetor[j]>aux){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=aux;
        }
    }
    public static void selectionSort(int vetor[]){
        int i,j,aux;
    }
    public static void main(String[] args) {
        int vetor[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
