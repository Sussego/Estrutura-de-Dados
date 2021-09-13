import java.sql.SQLOutput;

public class ListaEncadeada{
  No primeiro;
  No ultimo;
  //Insere novo aluno
  public void cadastrarAluno(No n){
    if (primeiro == null){
      primeiro = n;
      ultimo = n;
    }else{
      ultimo.setProximo(n);
      ultimo.setAnterior(ultimo);
      ultimo = n;
    }
    System.out.println("Aluno Cadastrado");
  }

  
  //imprime alunos
  public void imprimirAlunos(){
    No aux = primeiro;
    System.out.println(" -=-=-=-=-=Elementos=-=-=-=-=-");
    while (aux != null){
      System.out.print(aux.toString());
      aux = aux.getProximo();
    }
  }
}