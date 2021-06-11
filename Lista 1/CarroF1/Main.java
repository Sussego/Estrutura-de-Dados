import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Criando Vetor de carros
    CarroF1 carros[] = new CarroF1[10];
    Scanner leitor = new Scanner(System.in);
    int opcao;
    int cadastros = 0;
    //menu
    do{
      System.out.print("\n\n\n-=-=-=-=-Carros Formula 1-=-=-=-=-\n1 - Cadastrar(Limite de 10)\n2 - Buscar Por Equipe\n3 - Mostrar Todos\n4 - Remover Equipe\n0 - Sair\nSelecione opcao:");
      opcao = leitor.nextInt();
      //cadastrar equipe
      if(opcao == 1){
        if(cadastros < 10){
          carros[cadastros] = new CarroF1();
          carros[cadastros].cadastrar();
          cadastros++;
        }else{
          System.out.println("Quantida maxiama de equipes atingida!");
        }
      }
      //mostrar informacoes da equipe
      if(opcao == 2){
        String buscaEquipe;
        leitor.nextLine();
        System.out.print("Nome da equipe para pesquisa:");
        buscaEquipe = leitor.nextLine();
        for(int i = 0 ; i < cadastros ; i++){
          if(buscaEquipe.equalsIgnoreCase(carros[i].equipe)){
            System.out.println("\n-=-=-=-=Dados=-=-=-=-");
            carros[i].imprimir();
          }
        }
      }
      //mostrar inforacoes de todas equipes
      if(opcao == 3){
        System.out.println("\n-=-=-=-=Dados=-=-=-=-");
        for(int i = 0 ; i < cadastros ; i++){
          carros[i].imprimir();
          }
      }
      //remover equipe
      if(opcao == 4){
        String buscaEquipe;
        leitor.nextLine();
        System.out.print("Nome da equipe a ser REMOVIDA:");
        buscaEquipe = leitor.nextLine();
        for(int i = 0 ; i < cadastros ; i++){
          if(buscaEquipe.equalsIgnoreCase(carros[i].equipe)){
            for(int j = i ; j < cadastros ; j++){
              carros[j] = carros[j+1];
            }
            cadastros--;
          }
        }
      }
    }while(opcao != 0);
  }
}