import java.util.*;

public class Grafo {
    private ArrayList<Vertice> vertices;
    private int ordem;
    private int tamanho;
    private ArrayList<Aresta> arestas;
    private Boolean direcionado;
    private Boolean ponderado;

    public Grafo(Boolean direcionado, Boolean ponderado) {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
        this.direcionado = direcionado;
        this.ponderado = ponderado;
    }

    ;

    public void addVertice(Vertice vertice) {

        this.vertices.add(vertice);
        ordem++;
    }

    public void addAresta(Aresta aresta) {

        this.arestas.add(aresta);
        tamanho++;
    }

    @Override
    public String toString() {
        return "Grafo{" +
                "vertices=" + vertices +
                ", arestas=" + arestas +
                '}';
    }

    public String isDigrafo() {
        for (Aresta a : arestas) {
            if (a.getOrigem() == a.getDestino()) {
                direcionado = true;
                return ("é digrafo");
            }
            for (Aresta b : arestas) {
                if (a != b) {
                    if (a.getOrigem() == b.getDestino() && a.getDestino() == b.getOrigem()) {
                        direcionado = true;
                        return ("é digrafo");
                    }
                }
            }
        }

        return ("nao e digrafo");
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String grauVertice(Vertice v) {
        int contadorin = 0;
        int contadorout = 0;
        for (Aresta a : arestas) {
            if (a.getDestino().equals(v)) {
                contadorin++;
            }
            if (a.getOrigem().equals(v)) {
                contadorout++;
            }
        }
        if (direcionado) {
            return "( o Grafo é direcionado e o vertice " + "'" + v + "'" + " tem grauIn:" + contadorin + ",e grauOut: " + contadorout + " )";
        }
        return "(O Grafo é N-direcionado e tem grau do vertice " + "'" + v + "': " + contadorin + contadorout + ")";

    }

    public ArrayList<Vertice> adjacencia(Vertice v) {
        ArrayList<Vertice> ad = new ArrayList<Vertice>();
        for (Aresta a : arestas) {
            if (a.getDestino().equals(v)) {
                ad.add(a.getOrigem());
            }

        }
        return ad;
    }

    public void incidencia1() {

        int[][] matriz = new int[vertices.size()][arestas.size()];


        for (int i = 0; i < arestas.size(); i++) {
            int indexO = vertices.indexOf(arestas.get(i).getOrigem());
            int indexD = vertices.indexOf(arestas.get(i).getDestino());
            matriz[indexO][i] = 1;
            matriz[indexD][i] = 1;
        }


        System.out.print("  ");
        for (int i = 0; i < arestas.size(); i++) {
            System.out.print(arestas.get(i).getNome() + "  ");
        }
        System.out.println();

        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i) + " ");
            for (int j = 0; j < arestas.size(); j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

    }


    public void adjacenciaMatriz() {
        int contador = 0;
        int aux = getOrdem();

        int[][] matriz = new int[aux][aux];

        for (int i = 0; i < arestas.size(); i++) {
            int peso = arestas.get(i).getPeso();
            int indexO = vertices.indexOf(arestas.get(i).getOrigem());
            int indexD = vertices.indexOf(arestas.get(i).getDestino());

            matriz[indexO][indexD] = peso;

            if (!direcionado) {
                matriz[indexD][indexO] = peso;
            }
        }

        System.out.print("   ");
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i) + "  ");
            for (int j = 0; j < vertices.size(); j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < vertices.size(); i++) {
            if (matriz[i][i] == 0) {
                contador++;
            }
        }
        if (contador == vertices.size()) {
            System.out.print("O grafo é não direcionado");
        }
        System.out.println();
    }


    public int calculoComprimento(Vertice[] caminho) {
        if (!ponderado) return caminho.length - 1;
        int soma = 0;
        for (int i = 0; i < caminho.length - 1; i++) {
            for (int j = 0; j < arestas.size(); j++) {
                if (arestas.get(j).getOrigem().equals(caminho[i]) && arestas.get(j).getDestino().equals(caminho[i + 1])) {
                    soma += arestas.get(j).getPeso();
                    break;
                }
            }
        }
        return soma;
    }

    public String calculoMenorCaminho(Vertice[]... caminhos) {
        int menorComprimento = calculoComprimento(caminhos[0]);
        Vertice[] menorCaminho = caminhos[0];
        for (int i = 1; i < caminhos.length; i++) {
            int comprimento = calculoComprimento(caminhos[i]);
            if (comprimento < menorComprimento) {
                menorComprimento = comprimento;
                menorCaminho = caminhos[i];
            }
        }
        return "o " + Arrays.toString(menorCaminho);
    }
    public String buscaEmProfundidade(Vertice inicial, Vertice objetivo) {
        Stack<Vertice> pilha = new Stack<>();//é uma pilha de vértices utilizada para armazenar os vértices a serem explorados durante a busca
        List<Vertice> visitados = new ArrayList<>();// Lista de vértices que foram visitados
        List<Vertice> caminho = new ArrayList<>(); // Lista de vertices que representa o caminho

        pilha.push(inicial);// insere o vertice inicial na pilha
        visitados.add(inicial); // insere o vertice inicial na lista de visitados

        while (!pilha.isEmpty()) {
            Vertice atual = pilha.peek();// obtem o vertice do topo da pilha(nesse caso o vertice atuak)
            caminho.add(atual); // adiciona o vertice atual na lista de caminhp

            if (atual.equals(objetivo)) { // verifica se o vertice atual é igual ao vertice final, se for, retorna o caminho e o comprimento
                return "Caminho: " + caminho + ", Comprimento: " + caminho.size();
            }

            List<Vertice> adjacentes = adjacencia(atual);// adiciona as adjacencias do vertice atual a um arrayList
            boolean todosVisitados = true;// flag para ver se todos os elementos foram visitados

            for (Vertice adjacente : adjacentes) { //dentro do loop for é verificado se o vértice adjacente está na lista visitados.
                                                    // Se sim, o vértice adjacente é inserido na pilha, marcado como visitado e a variável todosVisitados é definida como false.
                if (!visitados.contains(adjacente)) {
                    pilha.push(adjacente);
                    visitados.add(adjacente);
                    todosVisitados = false;
                    break;
                }
            }

            if (todosVisitados) {// se todosVisitados for true,é pq todos os vértices adjacentes já foram visitados
                // e se nao foi encontrado com as adjacencias do vertice atual, retrocedemos um nivel
                pilha.pop();// remove o vertice "atual" da pilha
                caminho.remove(atual); //
            }
        }

        return "O vértice objetivo não foi encontrado. Percurso: " + caminho;
    }
    public String buscaEmLargura(Vertice inicial, Vertice objetivo) {
        Queue<Vertice> fila = new LinkedList<>();
        List<Vertice> visitados = new ArrayList<>();
        List<Vertice> caminho = new ArrayList<>();

        fila.offer(inicial);
        visitados.add(inicial);

        while (!fila.isEmpty()) {
            Vertice atual = fila.poll();
            caminho.add(atual);

            if (atual.equals(objetivo)) {
                return "Caminho: " + caminho + " Comprimento: " + caminho.size();
            }

            List<Vertice> adjacentes = adjacencia(atual);

            for (Vertice adjacente : adjacentes) {
                if (!visitados.contains(adjacente)) {
                    fila.offer(adjacente);
                    visitados.add(adjacente);
                }
            }
        }

        return "O vértice objetivo não foi encontrado" + "Caminho: "+caminho;
    }
    public String dijkstra(Vertice origem, Vertice destino) {

        if (!ponderado) {
            return "O grafo não é ponderado";
        }


        int INFINITO = Integer.MAX_VALUE;
        int[] distancias = new int[vertices.size()];
        Arrays.fill(distancias, INFINITO);
        int[] predecessores = new int[vertices.size()];
        Arrays.fill(predecessores, -1);
        boolean[] visitados = new boolean[vertices.size()];
        distancias[vertices.indexOf(origem)] = 0;


        for (int i = 0; i < vertices.size(); i++) {
            int u = minDistancia(distancias, visitados);
            visitados[u] = true;

            if (vertices.get(u).equals(destino)) {
                break;
            }

            for (Aresta a : arestas) {
                if (a.getOrigem().equals(vertices.get(u))) {
                    int v = vertices.indexOf(a.getDestino());
                    int peso = a.getPeso();
                    int distanciaTotal = distancias[u] + peso;

                    if (!visitados[v] && distanciaTotal < distancias[v]) {
                        distancias[v] = distanciaTotal;
                        predecessores[v] = u;
                    }
                }
            }
        }


        List<Vertice> caminho = new ArrayList<>();
        int u = vertices.indexOf(destino);
        while (predecessores[u] != -1) {
            caminho.add(0, vertices.get(u));
            u = predecessores[u];
        }
        caminho.add(0, origem);

        String resultado = "Caminho mínimo: ";
        for (Vertice v : caminho) {
            resultado += v.toString() + " -> ";
        }
        resultado = resultado.substring(0, resultado.length() - 4);
        resultado += "\nDistância total: " + distancias[vertices.indexOf(destino)];

        return resultado;
    }

    private int minDistancia(int[] distancias, boolean[] visitados) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < distancias.length; i++) {
            if (!visitados[i] && distancias[i] <= min) {
                min = distancias[i];
                minIndex = i;
            }
        }

        return minIndex;
    }





}



