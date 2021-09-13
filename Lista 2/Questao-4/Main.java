import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    ListaNos lista = new ListaNos();
    Atleta a;
    int opcao = 0;
    String nome;
    float altura;
    float peso;
    String esporte;
    String patrocineo;
    //menu
    do{
      System.out.print("\n\n\n-=-=-=-=-=Lista Encadeada=-=-=-=-=-\n1 - Registrar Atleta\n2 - Remover Atleta\n3 - Buscar Atleta na Lista\n4 - Mostrar todos Atletas\n0 - Sair\n-=-=-=-=-=-=--=-=-=-=-\nSelecione a opcao:");
      opcao = leitor.nextInt();
      leitor.nextLine();
      //Cadastrar Atleta
      if(opcao == 1){
        System.out.print("-=-=-Registrando atleta=-=-=-=-\nNome: ");
        nome = leitor.nextLine();
        System.out.print("Altura: ");
        altura = leitor.nextFloat();
        leitor.nextLine();
        System.out.print("Peso: ");
        peso = leitor.nextFloat();
        leitor.nextLine();
        System.out.print("Modalidade do Esporte: ");
        esporte = leitor.nextLine();
        System.out.print("Patrocinadores: ");
        patrocineo = leitor.nextLine();
        a = new Atleta(nome, altura, peso, esporte, patrocineo);
        lista.inserirAtleta(new No(a));
      }
      //Remover Atleta
      if(opcao == 2){
        String remover;
        System.out.print("Nome do Atleta a ser removido: ");
        remover = leitor.nextLine();
        lista.removerAtleta(remover);
      }
      //Buscar por Atleta
      if(opcao == 3){
        String busca;
        System.out.print("Nome do Atleta a ser Procurado: ");
        busca = leitor.nextLine();
        lista.busca(busca);
      }
      //Mostrar informacoes de todos Atletas
      if(opcao == 4){
        lista.imprimirLista();
      }

    }while(opcao != 0);
  }
}