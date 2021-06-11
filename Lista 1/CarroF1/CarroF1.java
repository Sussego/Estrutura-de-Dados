import java.util.Scanner;
public class CarroF1{
  String equipe;
  String fabrMotor;
  String pneus;
  String corPredom;
  String piloto1;
  String piloto2;
  float peso;
  Scanner leitor = new Scanner(System.in);
  //construtor
  CarroF1(){
    equipe = " ";
    fabrMotor = " ";
    pneus = " ";
    corPredom = " ";
    piloto1 = " ";
    piloto2 = " ";
    peso = 0;
  }
  //metodos
  void cadastrar(){
    System.out.print("\n\n-=-=-=-=-=Cadastrar=-=-=-=-=-\nEquipe:");
    equipe = leitor.nextLine();
    System.out.print("Fabricante do Motor:");
    fabrMotor = leitor.nextLine();
    System.out.print("Pneus:");
    pneus = leitor.nextLine();
    System.out.print("Cor Predominante:");
    corPredom = leitor.nextLine();
    System.out.print("Piloto 1:");
    piloto1 = leitor.nextLine();
    System.out.print("Piloto 2:");
    piloto2 = leitor.nextLine();
    System.out.print("Peso do Carro:");
    peso = leitor.nextFloat();
    leitor.nextLine();
  }
  void imprimir(){
    System.out.print("\nEquipe:" + equipe);
    System.out.print("\nFabricante do Motor:" + fabrMotor);
    System.out.print("\nPneus:"+pneus);
    System.out.print("\nCor Predominante:" + corPredom);
    System.out.print("\nPiloto 1:" + piloto1);
    System.out.print("\nPiloto 2:" + piloto2);
    System.out.print("\nPeso do Carro:" + peso+"\n\n\n");
  }
}











  /*}
  cadastra(String equipe, String fabrMotor, String pneus, String corPredom, String piloto1, String piloto2, float peso){
    this.equipe = equipe;
    this.fabrMotor = fabrMotor;
    this.pneus = pneus;
    this.corPredom = corPredom;
    this.piloto1 = piloto1;
    this.piloto2 = piloto2;
    this.peso = peso;
  }*/
