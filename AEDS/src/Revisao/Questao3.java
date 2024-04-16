/*
 * multiplica_recursivo(n1,n2)
 */

package Revisao;


public class Questao3 {
    public static int multiplica_recursivo(int n1, int n2){
        
        return multiplica(n1,n2,0);
        
    }
    public static int multiplica(int n1, int n2,int start){
        if(start>=n2){
            return 0;
        }
        return n1+ multiplica(n1,n2,start+1);
    }
    public static void main(String[] args){
        int n1 = 7;
        int n2 = 3;
        int n3 = multiplica_recursivo(n1,n2);
        System.out.println(n3);
    }
}
