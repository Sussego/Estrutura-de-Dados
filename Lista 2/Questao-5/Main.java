class Main {
  public static void main(String[] args) {
    System.out.println("-=-=-=-=-FILA=-=-=-=-");
    FilaEncadeada lista = new FilaEncadeada();
    //cria objetos
    ClasseTeste t1 = new ClasseTeste("A");
    ClasseTeste t2 = new ClasseTeste("B");
    ClasseTeste t3 = new ClasseTeste("C");
    ClasseTeste t4 = new ClasseTeste("D");
    //insere na Fila
    lista.inserirNo(new No(t1));
    lista.inserirNo(new No(t2));
    lista.inserirNo(new No(t3));
    lista.inserirNo(new No(t4));
    //imprime
    lista.imprimirLista();
    //remove objetos da fila
    lista.removerNo();
    lista.removerNo();
    //imprime lista modificada
    lista.imprimirLista();


    System.out.println("\n\n\n-=-=-=-=PILHA=-=-=-=-");
    PilhaEncadeada lista2 = new PilhaEncadeada();
    //Insere na Pilha
    lista2.inserirNo(new No(t1));
    lista2.inserirNo(new No(t2));
    lista2.inserirNo(new No(t3));
    lista2.inserirNo(new No(t4));
    //imprime
    lista2.imprimirLista();
    //remove objetos da pilha
    lista2.removerNo();
    lista2.removerNo();
    //imprime pilha modificada
    lista2.imprimirLista();
  }
}