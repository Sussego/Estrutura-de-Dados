public class PilhaEncadeada {
  No topo;
  public void inserirNo(No n){
    if(topo == null){
      topo = n;
    }else{
      topo.setProximo(n);
      n.setAnterior(topo);
      topo = n;
    }
    System.out.println("Inserido!!!");
  }

  public No removerNo(){
    No remove = topo;
    while (remove!=null){
      if (remove.getAnterior()!=null){
        No anterior = remove.getAnterior();
        anterior.setProximo(remove.getProximo());
        if (remove.getProximo()!=null) {
          No proximo = remove.getProximo();
          proximo.setAnterior(remove.getAnterior());
        }
        if (remove == topo){
          topo = anterior;
        }
        remove.setProximo(null);
        System.out.println("Elemento removido"+remove.toString());
        return remove;
      }else{
        topo = remove.getProximo();
        topo.setAnterior(null);
        if (topo == remove){
          topo= remove.getProximo();
        }
        remove.setProximo(null);
        System.out.println("Elemento removeovido"+remove.toString());
        return remove;
      }
    }
        return null;
  }

  public void imprimirLista(){
    No aux = topo;
    System.out.println("-=-=-=-=Pilha Completa=-=-=-=-");
    while (aux!=null){
      System.out.print(aux.hashCode()+ " - ");
      System.out.print(aux.toString());
      if (aux.getAnterior()!=null){
        System.out.print(" Ponteiro Anterior: "+aux.getAnterior().hashCode());
      }
      if (aux.getProximo()!=null){
        System.out.print(" Ponteiro Posterior: "+ aux.getProximo().hashCode());
      }
        System.out.print("\n");
        aux = aux.getAnterior();
    }
  }
}