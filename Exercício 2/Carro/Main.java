import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    Carro carro3 = new Carro();
    Scanner leitor = new Scanner(System.in);

    //inserindo carros//
    System.out.println("INSIRA AS INFORMAÇÕES");
    System.out.println("CARRO1");
    System.out.print("Marca do carro:");
    carro1.marca = leitor.nextLine();
    System.out.print("Modelo do carro:");
    carro1.modelo = leitor.nextLine();
    System.out.print("Ano de fabricação do carro:");
    carro1.ano = leitor.nextInt();
    leitor.nextLine();
    System.out.print("Numero de portas do carro:");
    carro1.portas = leitor.nextInt();
    leitor.nextLine();

    System.out.println("CARRO2");
    System.out.print("Marca do carro:");
    carro2.marca = leitor.nextLine();
    System.out.print("Modelo do carro:");
    carro2.modelo = leitor.nextLine();
    System.out.print("Ano de fabricação do carro:");
    carro2.ano = leitor.nextInt();
    leitor.nextLine();
    System.out.print("Numero de portas do carro:");
    carro2.portas = leitor.nextInt();
    leitor.nextLine();

    System.out.println("CARRO3");
    System.out.print("Marca do carro:");
    carro3.marca = leitor.nextLine();
    System.out.print("Modelo do carro:");
    carro3.modelo = leitor.nextLine();
    System.out.print("Ano de fabricação do carro:");
    carro3.ano = leitor.nextInt();
    leitor.nextLine();
    System.out.print("Numero de portas do carro:");
    carro3.portas = leitor.nextInt();
    leitor.nextLine();
    
    //mostrando carros//
    System.out.println("\n");
    carro1.dadosCarro();
    carro2.dadosCarro();
    carro3.dadosCarro();
  }
}