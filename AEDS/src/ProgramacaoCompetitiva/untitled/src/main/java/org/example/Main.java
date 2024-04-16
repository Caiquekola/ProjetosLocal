package org.example;

import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 8;
        List<Integer> numeros = new Stack<>();
        numeros.add(i);
        fatorar(numeros,i);
    }
    public static void fatorar(List<Integer> numeros, int numeroAlvo){
        while(numeros.get(0)!=1){
            System.out.println(numeros);

            if(numeros.size()>1&&numeros.get(1)==1){
                int inicio = numeros.get(0)-1;
                numeros.clear();
                numeros.add(inicio);
                completar(numeros,numeroAlvo);
            }else{
                for (int i = numeros.size()-1; i >= 0 ; i--) {
                    if(numeros.get(i)!=1){
                        numeros.set(i,numeros.get(i)-1);
                        numeros.add(1);
                        break;
                    }
                }
            }
        }

        System.out.println(numeros);
    }

    public static void completar(List<Integer> numeros, int numeroAlvo){
        int somatorio = numeros.get(0);
        while(somatorio!=numeroAlvo){
            if(numeroAlvo-somatorio <= numeros.get(0)){
                numeros.add(numeroAlvo-somatorio);
                somatorio+=numeroAlvo-somatorio;
            }else{
                numeros.add(numeros.get(0));
                somatorio+=numeros.get(0);
            }
        }
    }
}

