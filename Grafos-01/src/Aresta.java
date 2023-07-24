public class Aresta {
    private Vertice origem;
    private Vertice destino;
    private String nome;
    private int peso;

    public Aresta(Vertice origem, Vertice destino,String nome,int peso) {
        this.origem = origem;
        this.destino = destino;
        this.nome = nome;
        this.peso = peso;
    }
    public Aresta(Vertice origem, Vertice destino,String nome) {
        this.origem = origem;
        this.destino = destino;
        this.nome = nome;

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "("+origem +","+destino;
    }



}
