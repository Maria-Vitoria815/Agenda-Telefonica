package lista;
import basicas.Contato;

public class Lista {
    private Celula cabeca;
    private Celula cauda;
    private int totalDeElementos;

    public Lista() {
        this.cabeca = null;
        this.cauda = null;
        this.totalDeElementos = 0;
    }

    
    public void imprimir() {
        Celula atual = cabeca;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProxima();
        }
    }

    
    public void adicionarNoInicio(Contato contato) {
        Celula novaCelula = new Celula(cabeca, null, contato);
        if (cabeca != null) {
            cabeca.setAnterior(novaCelula);
        }
        cabeca = novaCelula;
        if (cauda == null) {
            cauda = cabeca;
        }
        totalDeElementos++;
    }

   
    public void adicionarNoFim(Contato contato) {
        Celula novaCelula = new Celula(null, cauda, contato);
        if (cauda != null) {
            cauda.setProxima(novaCelula);
        }
        cauda = novaCelula;
        if (cabeca == null) {
            cabeca = cauda;
        }
        totalDeElementos++;
    }

    
    public void removerDoInicio() {
        if (cabeca == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        cabeca = cabeca.getProxima();
        if (cabeca != null) {
            cabeca.setAnterior(null);
        } else {
            cauda = null;
        }
        totalDeElementos--;
    }

    
    public void removerDoFim() {
        if (cauda == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        cauda = cauda.getAnterior();
        if (cauda != null) {
            cauda.setProxima(null);
        } else {
            cabeca = null;
        }
        totalDeElementos--;
    }

    
    public void removerPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= totalDeElementos) {
            System.out.println("Posição inválida.");
            return;
        }

        Celula atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        if (atual.getAnterior() != null) {
            atual.getAnterior().setProxima(atual.getProxima());
        } else {
            cabeca = atual.getProxima();
        }

        if (atual.getProxima() != null) {
            atual.getProxima().setAnterior(atual.getAnterior());
        } else {
            cauda = atual.getAnterior();
        }

        totalDeElementos--;
    }

   
    public Contato pesquisarPorNome(String nome) {
        Celula atual = cabeca;
        while (atual != null) {
            Contato contato = (Contato) atual.getElemento();
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
            atual = atual.getProxima();
        }
        System.out.println("Contato não encontrado.");
        return null;
    }

   
    public int getTotalDeElementos() {
        return totalDeElementos;
    }
}
