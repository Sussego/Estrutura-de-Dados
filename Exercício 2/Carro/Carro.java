public class Carro{
  String marca;
  String modelo;
  int ano;
  int portas;

  Carro(){
    marca = " ";
    modelo = " ";
    ano = 0;
    portas = 0;
  }

  void dadosCarro(){
    System.out.println("Marca:"+marca+"\nModelo:"+modelo+"\nAno de Fabricação:"+ano+"\nNumero de Portas:"+portas+"\n-------------------------------");
  }
}