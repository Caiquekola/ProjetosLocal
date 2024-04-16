
package Revisao;

//Criar método para implementar nó no começo, fim, excluir nó, recomeçar lista, comparar se duas listas são iguais, merge delas
public class LinkedList <E>{
    Item<E> lista;
    int numItens;
    
    public LinkedList(){
        lista = null;
        numItens = 0;
    }
    public LinkedList(E item){
        lista.elemento = item;
        lista.proximo = null;
        numItens = 1;
    }
    
    public boolean vazia(){
        return numItens == 0;
    }
    
    
}

class Item<E>{
    E elemento;
    Item<E> proximo;
    
    public Item(E elemento, Item proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }
}