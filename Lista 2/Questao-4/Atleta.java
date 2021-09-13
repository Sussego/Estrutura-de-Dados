public class Atleta{
  String nome;
  float altura;
  float peso;
  String esporte;
  String patrocineo;

  Atleta(String n, float a, float p, String e, String pat){
    nome = n;
    altura = a;
    peso = p;
    esporte = e;
    patrocineo = pat;
  }
  public String toString(){
        return "Nome: "+nome+"\naltura: " + altura + "\npeso: " + peso + "\nEsporte: " + esporte + "\nPatrocinadores: " + patrocineo + "\n";
    }
  public String getNome(){
    return nome;
  }
}