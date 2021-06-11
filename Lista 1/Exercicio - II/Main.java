//import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int vet[] = new int[20];
    int aux;
    
   /* Scanner leitor = new Scanner(System.in);
    for(int i = 0 ; i < 20 ; i++){
      System.out.printf("Insira o %d Valor:", i+1);
      vet[i] = leitor.nextInt();
    }*/

    /*escrevendo posicao e valor*/
    vet[0] = 16;
    vet[1] = 28;
    vet[2] = 63;
    vet[3] = 51;
    vet[4] = 1;
    vet[5] = 26;
    vet[6] = 94;
    vet[7] = 56;
    vet[8] = 37;
    vet[9] = 39;
    vet[10] = 87;
    vet[11] = 72;
    vet[12] = 21;
    vet[13] = 7;
    vet[14] = 5;
    vet[15] = 9;
    vet[16] = 69;
    vet[17] = 74;
    vet[18] = 23;
    vet[19] = 11;
    /*antes de inverter*/
    System.out.print("Valores: ");
    for(int i = 0 ; i < 20 ; i++){
      System.out.print(vet[i]+" ");
    }
    /*inverte*/
    for(int i = 0 ; i < 10 ; i++){
      aux = vet[i];
      vet[i] = vet[19-i];
      vet[19-i] = aux;
    }
    /*depois de inverter*/
    System.out.print("\nInvertido: ");
    for(int i = 0 ; i < 20 ; i++){
      System.out.print(vet[i]+" ");
    }
  }
}