package BuscaBinaria;
public class BuscaBinaria {

   
    public static boolean buscaPesquisada(int[] vetor, int elemento,int e, int d){
        int meio = (e+d)/2;
        System.out.println(e+" "+meio+" "+d);
        if(vetor[meio]==elemento){
            return true;
        }
        if(e==d){
            return false;
        }else{
            if(elemento>vetor[meio]){
                return buscaPesquisada(vetor,elemento,meio+1,d);
            }else{ 
                return buscaPesquisada(vetor,elemento,e,meio-1);

            }
        }
        
        
    }
    public static void main(String[] args) {
        int vetor[] = new int[5];
        for (int i = 0; i < 5; i++) {
            vetor[i] = i;
        }
        int fim = vetor.length-1;
        //System.out.println(busca(vetor,50,0,fim));
        System.out.println(buscaPesquisada(vetor,4,0,fim));
    }

}
