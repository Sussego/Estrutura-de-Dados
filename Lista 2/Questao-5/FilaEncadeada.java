import java.sql.SQLOutput;

public class FilaEncadeada{
  No primeiro;
  No ultimo;
  //Insere novo elemento
  public void inserirNo(No n){
    if (primeiro == null){
      primeiro = n;
      ultimo = n;
    }else{
      ultimo.setProximo(n);
      ultimo.setAnterior(ultimo);
      ultimo = n;
    }
    System.out.println("Inserido!!!");
  }
  //Remove um elemento pelo texto digitado
  public No removerNo(){
    No remover = primeiro;
    while (remover != null) {
      primeiro = remover.getProximo();
      primeiro.setAnterior(null);
      if (ultimo == remover) {
        ultimo = remover.getProximo();
      }
      remover.setProximo(null);
      System.out.println("Elemento removido. " + remover.toString());
      return remover;
      }
    System.out.println("Elemento nao Encontrado");
    return null;
  }

  public void imprimirLista(){
    No aux = primeiro;
    System.out.println(" -=-=-=-=-=Elementos=-=-=-=-=-");
    while (aux != null){
      System.out.print(aux.hashCode() + " - ");
      System.out.print(aux.toString());
      if(aux.getAnterior() != null){
        System.out.print(" Ponteiro Anterior: " + aux.getAnterior().hashCode());
      }
      if(aux.getProximo() != null){
        System.out.print(" Ponteiro posterior: "+ aux.getProximo().hashCode());
      }
      System.out.print("\n");
      aux = aux.getProximo();
    }
  }
}