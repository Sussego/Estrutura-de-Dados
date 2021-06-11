import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int vet1[] = new int[10];
    int vet2[] = new int[10];
    Scanner leitor = new Scanner(System.in);
    /*le os numeros*/
    for(int i = 0 ; i < 10 ; i++){
      System.out.printf("Insira o %d Valor:", i+1);
      vet1[i] = leitor.nextInt();
    }
    /*copia para segundo vetor*/
    for(int i = 0 ; i < 10 ; i++){
      vet2[i] = vet1[i];
    }
    /*teste*/
    System.out.println("Primeiro vetor:");
    for(int i = 0 ; i < 10 ; i++){
      System.out.print(vet1[i]+" ");
    }
    System.out.println("\nVetor Copia:");
    for(int i = 0 ; i < 10 ; i++){
      System.out.print(vet2[i]+" ");
    }
  }
}