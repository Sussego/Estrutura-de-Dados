class Main {
  public static void main(String[] args) {
    ListaEncadeada lista = new ListaEncadeada();
    Aluno a = new Aluno("Albert", 1010, 75.6, "Matematica");
    Aluno a2 = new Aluno("Chomsky", 1011, 80.2, "Computacao");
    Aluno a3 = new Aluno("Navier", 1012, 92.3, "Algebra");
    lista.cadastrarAluno(new No(a));
    lista.cadastrarAluno(new No(a2));
    lista.cadastrarAluno(new No(a3));

    lista.imprimirAlunos();
  }
}