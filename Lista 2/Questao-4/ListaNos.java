import java.sql.SQLOutput;

public class ListaNos{
  No primeiro;
  No ultimo;
  //Insere novo Atleta
  public void inserirAtleta(No n){
    if (primeiro == null){
      primeiro = n;
      ultimo = n;
    }else{
      ultimo.setProximo(n);
      ultimo= n;
    }
    System.out.println("Atleta Registrado!!!");
  }
  //Remova um atleta pelo seu nome
  public No removerAtleta(String name){
    No anterior = null;
    No remover = primeiro;
    //percorre a estrutura verificando
    while (remover != null){
      if (remover.getNome().contains(name)){
        if (anterior != null){
          //recebe a nova indicação do ponteiro
          anterior.setProximo(remover.getProximo());
          if (remover == ultimo){
            ultimo = anterior;
          }
          //retira o elemento da cadeia de ponteiros
          remover.setProximo(null);
          System.out.println("Atleta Removido!!!");
          return remover;
        }else{
          primeiro = remover.getProximo();
          //retira o elemento da cadeia de ponteiros
          remover.setProximo(null);
          if (ultimo == remover){
            ultimo = remover.getProximo();
          }
          System.out.println("Atleta Removido!!!");
          return remover;
        }
      }
      //passa para o proximo no
      anterior = remover;
      remover = remover.getProximo();
    }
      System.out.println("Atleta nao Registrado");
      return null;
  }

  public void imprimirLista(){
    No aux = primeiro;
    System.out.println(" -=-=-=-=-=Lista=-=-=-=-=-");
    while (aux != null){
      System.out.println(aux.toString());
      aux = aux.getProximo();
    }
  }

    public No busca(String busca){
        No aux = primeiro;
        while(aux != null){
            if (aux.getNome().contains(busca)){
                System.out.println(aux.toString());
                return aux;
            }
            aux = aux.getProximo();
        }
        System.out.println("Atleta nao Registrado");
        return null;
  }

}