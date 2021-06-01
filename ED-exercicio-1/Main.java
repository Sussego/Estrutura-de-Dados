import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //iniciando alunos no construtor//
    Aluno aluno1 = new Aluno("Rogerio", 70.6);
    Aluno aluno2 = new Aluno("Mario", 83.4);
    Aluno aluno3 = new Aluno("Pedro", 90);
    //alunos para preencher//
    Aluno aluno4 = new Aluno();
    Aluno aluno5 = new Aluno();
    Scanner leitor = new Scanner(System.in);

    //Inserindo nomes e notas//
    System.out.print("Insira o nome do aluno 4:");
    aluno4.nome = leitor.nextLine();
    System.out.print("Insira a media das notas:");
    aluno4.mediaNotas = leitor.nextDouble();
    leitor.nextLine();
    System.out.print("Insira o nome do aluno 5:");
    aluno5.nome = leitor.nextLine();
    System.out.print("Insira a media das notas:");
    aluno5.mediaNotas = leitor.nextDouble();

    //Mostrando nomes e notas//
    System.out.println("\nNome:" + aluno1.nome + "\nMedia:"+aluno1.mediaNotas + "\n-------------------");
    System.out.println("Nome:" + aluno2.nome + "\nMedia:"+aluno2.mediaNotas + "\n-------------------");
    System.out.println("Nome:" + aluno3.nome + "\nMedia:"+aluno3.mediaNotas + "\n-------------------");
    System.out.println("Nome:" + aluno4.nome + "\nMedia:"+aluno4.mediaNotas + "\n-------------------");System.out.println("Nome:" + aluno5.nome + "\nMedia:"+aluno5.mediaNotas + "\n-------------------");
  }
}