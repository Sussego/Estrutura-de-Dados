import java.util.Scanner;
class Media {
  public float calc(float a, float b, float c){
    return((a+b+c)/3);
  }
}
class Main {
  public static void main(String[] args) {
    Media media = new Media();
    Scanner leitor = new Scanner(System.in);
    float num1;
    float num2;
    float num3;
    float mediaNum;
    System.out.print("Calculador de media\nPrimeiro numero:");
    num1 = leitor.nextInt();
    System.out.print("Segundo numero:");
    num2 = leitor.nextInt();
    System.out.print("Terceiro numero:");
    num3 = leitor.nextInt();
    mediaNum = media.calc(num1, num2, num3);
    System.out.println("-----------------\nNumeros utilizados:"+num1+" "+num2+" "+num3);
    System.out.printf("Media:%.2f", mediaNum);
  }
}