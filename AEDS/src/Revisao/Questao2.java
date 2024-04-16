import java.util.Random;

public class Questao2 {
  public static void main(String[] args) {
    int vetor[] = new int[100];
    int vetorInvertido[] = new int[100];
    Random random = new Random();
    // Aqui crio um random para gerar números aleatórios

    // Gero os números aleatórios e já insiro no vetor
    System.out.println("Vetor organizado: ");
    for (int i = 0; i < 100; i++) {
      vetor[i] = random.nextInt(100);
      System.out.print(vetor[i] + " ");
    }
    // Chamo a função recursiva
    vetorInvertido = inverter(vetor);
    System.out.println("Vetor novo: ");
    for (int i = 0; i < 100; i++) {
      System.out.print(vetorInvertido[i] + " ");
    }
  }

  public static int[] inverter(int vetor[]) {
    int vetorAuxiliar[] = new int[100];
    inverterRecursivo(vetor, vetorAuxiliar, 0);
    return vetorAuxiliar;
  }

  public static void inverterRecursivo(int vetor[], int vetorAux[], int comeco) {
    if (comeco >= 100) {
      return;
    }
    vetorAux[comeco] = vetor[99 - comeco];
    inverterRecursivo(vetor, vetorAux, comeco + 1);
  }
}