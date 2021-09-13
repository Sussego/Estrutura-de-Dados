public class No {
    Atleta obj;
    No proximo;

    No(Atleta obj){
        this.obj = obj;
    }

    public Atleta getAtleta(){
        return obj;
    }

    public String toString(){
        return obj.toString();
    }

    public void setProximo(No x){
        proximo = x;
    }
    public No getProximo(){
        return proximo;
    }

    public String getNome(){
      return obj.getNome();
    }
}