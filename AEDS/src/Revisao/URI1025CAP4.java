import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

import java.util.Scanner;
public class URI1025CAP4 {
    public static int  buscaBinaria(int vetor[],int item){
        return busca(vetor,item,0,vetor.length-1);
    }
    public static int busca(int v[], int item, int e, int d){
        int meio = (e+d)/2;
                System.out.println(e+" "+meio+" "+d);

        if(v[meio]==item){
            return meio;
        }
        if(e>=d){
            return -1;
        }
        if(item>v[meio]){
            return busca(v,item,meio+1,d);
        }else{
            return busca(v,item,e,meio-1);
        }
    }
    public static void sort(int v[]){
        int i, j, aux;
        for (i = 1; i < v.length; i++) {
            j = i - 1;
            aux = v[i];
            while(j>=0&&v[j]>aux){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = aux;
        }
    }
    public static void main(String[] args) throws IOException {
 
        
    
        int nMarble = 1, nCasos = 1, cont = 0;
        Scanner scan = new Scanner(System.in);
        do {
            nMarble = scan.nextInt();
            nCasos = scan.nextInt();
            if(nMarble==0&nCasos==0){
                break;
            }
            int marble[] = new int[nMarble];
            int casos[] = new int[nCasos];

            for (int i = 0; i < nMarble; i++) {
                marble[i] = scan.nextInt();
            }
            sort(marble);

            for (int i = 0; i < nCasos; i++) {
                casos[i] = scan.nextInt();
            }
            System.out.printf("CASE# %d:\n", cont + 1);
                            

            for (int i = 0; i < nCasos; i++) {
                int local = buscaBinaria(marble,casos[i]);

                
                if (local >= 0) {
                    System.out.printf("%d found at %d\n", casos[i], local+1);
                } else {
                    System.out.printf("%d not found\n", casos[i]);
                }

            }
            cont++;
        } while (true);

    
 
    }
 
}