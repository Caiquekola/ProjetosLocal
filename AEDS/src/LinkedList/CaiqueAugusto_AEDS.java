class LinkedList<E> {

  private Item<E> lista;

  private int size;



  public LinkedList() {

    lista = null;

  }



  public Item<E> getLista() {

    return lista;

  }



  public int getSize() {

    return size;

  }



  public void addHead(E item) {

    if (lista == null) {

      lista = new Item<E>(item, null);

    } else {

      Item<E> novoItem = new Item<E>(item, lista);

      lista = novoItem;

    }

    size++;

  }



  public void addTail(E item) {

    if (lista == null) {

      lista = new Item<E>(item, null);

    } else {

      Item<E> ponteiro = lista;

      for (; ponteiro.proximo != null; ponteiro = ponteiro.proximo) {

      }

      ponteiro.proximo = new Item<E>(item, null);

    }

    size++;

  }



  public boolean elementExist(E item) {

    if (lista == null)

      return false;

    Item<E> ponteiro = lista;

    do {

      if (ponteiro.elemento == item)

        return true;

      ponteiro = ponteiro.proximo;

    } while (ponteiro != null);

    return false;

  }



  public void printLinkedList() {

    Item<E> ponteiro = lista;

    System.out.println("Imprimindo a Lista encadeada");

    for (; ponteiro != null; ponteiro = ponteiro.proximo) {

      System.out.println(ponteiro.elemento);

    }

  }

//METODO PARA REMOVER UM NÓ

public void remove(E itemRemover) {
    if (lista == null) {
        return; // Lista vazia, não há nada para remover.
    }

    if (lista.elemento.equals(itemRemover)) {
        lista = lista.proximo; 
        size--;
        return;
    }

    Item<E> anterior = lista;
    Item<E> atual = lista.proximo;

    while (atual != null) {
        if (atual.elemento.equals(itemRemover)) {
            anterior.proximo = atual.proximo; 
            size--;
            return;
        }
        anterior = atual;
        atual = atual.proximo;
    }
}

//METODO PARA CONFERIR SE DUAS LISTAS ENCADEADAS SAO IGUAIS



//METÓDO PARA CIRAR UM MERGE DE DUAS LISTAS

public LinkedList<E> merge(LinkedList<E> listB) {
    LinkedList<E> mergedList = new LinkedList<E>();
    Item<E> lista1= this.lista;
    Item<E> lista2= listB.getLista();

    while (lista1 != null && lista2 != null) {
        mergedList.addTail(lista1.elemento);
        mergedList.addTail(lista2.elemento);
        lista1 = lista1.proximo;
        lista2 = lista2.proximo;
    }

    while (lista1 != null) {
        mergedList.addTail(lista1.elemento);
        lista2 = lista2.proximo;
    }
    while (lista2 != null) {
        mergedList.addTail(lista2.elemento);
        lista2 = lista2.proximo;
    }

    return mergedList;
}

  public static class Item<T> {

    T elemento;

    Item<T> proximo;



    Item(T item, Item<T> prox) {

      elemento = item;

      proximo = prox;

    }

  }



}
