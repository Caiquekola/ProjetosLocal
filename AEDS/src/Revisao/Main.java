import java.util.Random;

class Main {
  public static void main(String[] args) {
    // Questão 1
    resposta();

    // Questão 2
    System.out.println("\nQuestão 2: ");
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

    System.out.println("\nVetor novo: ");
    for (int i = 0; i < 100; i++) {
      System.out.print(vetorInvertido[i] + " ");
    }

    // Questão 3
    System.out.println("\nQuestão 3: ");
    int num1 = 5;
    int num2 = 10;
    System.out.print("Para os seguintes números ( 5 e 10 ): " + multiplica_recursivo(num1, num2));

    // Questão 4
    System.out.println("\nQuestão 4: ");
    int numTetranacci = tetranacci(10);
    System.out.println("Para o seguinte número ( 10 ): " + numTetranacci);

  }

  // Métodos, Procedimentos ou Funções realizadas para cada exercício

  // Questão 1, método
  public static void resposta() {
    System.out.println("Questão 1: ");

    System.out.println(
        "A função recebe um valor inteiro e retorna o somatório de todos os números até o número 0.\nExemplo para a = 5, o retorno será 15 (5 + 4 + 3 + 2 + 1 + 0 = 15)");
  }

  // Questão 2
  public static void inverterRecursivo(int vetor[], int vetorAux[], int comeco) {
    if (comeco >= 100) {
      return;
    }
    vetorAux[comeco] = vetor[99 - comeco];
    inverterRecursivo(vetor, vetorAux, comeco + 1);
  }

  public static int[] inverter(int vetor[]) {
    int vetorAuxiliar[] = new int[100];
    inverterRecursivo(vetor, vetorAuxiliar, 0);
    return vetorAuxiliar;
  }

  // Questão 3
  public static int multiplica_recursivo(int n1, int n2) {

    return multiplica(n1, n2, 0);

  }

  public static int multiplica(int n1, int n2, int start) {
    if (start >= n2) {
      return 0;
    }
    return n1 + multiplica(n1, n2, start + 1);
  }

  // Questão 4
  public static int tetranacci(int n) {
    // Caso base onde os três primeiros termos são 0, 0, 0.
    if (n <= 2) {
      return 0;
    } else if (n == 3) {
      // Caso onde o usuário informa o quarto termo;
      return 1;
    } else {
      return tetranacci(n - 1) + tetranacci(n - 2) + tetranacci(n - 3) + tetranacci(n - 4);
    }
  }
}