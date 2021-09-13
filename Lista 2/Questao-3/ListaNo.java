public class ListaNo{
  No primeiro;
  No ultimo;

  public void inserirNo(No n){
    if(primeiro == null){
      primeiro = n;
      ultimo = n;
    }else{
      ultimo.proximo = n;
      ultimo = n;
    }
  }
}