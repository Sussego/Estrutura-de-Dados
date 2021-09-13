public class Aluno{
  String nome;
  int matricula;
  double nota;
  String nomeCurso;
  
  Aluno(String n, int m, double no, String nom){
    nome = n;
    matricula = m;
    nota = no;
    nomeCurso = nom;
  }
  public String toString(){
    return "Nome: " + nome + "\nMatricula: " + matricula + "\nNota: " + nota + "\nNome do Curso: " + nomeCurso + "\n\n";
  }
}