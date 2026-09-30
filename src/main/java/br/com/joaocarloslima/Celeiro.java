package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro() {
        this.capacidade = 100;
        this.qtdeBatatas = 10;
        this.qtdeCenouras = 10;
        this.qtdeMorangos = 10;
    }

    public void armazenarBatata() throws Exception {
        if (celeiroCheio()) {
            throw new Exception("Celeiro cheio! Não há espaço disponível.");
        }
        this.qtdeBatatas++;
    }

    public void armazenarCenoura() throws Exception {
        if (celeiroCheio()) {
            throw new Exception("Celeiro cheio! Não há espaço disponível.");
        }
        this.qtdeCenouras++;
    }

    public void armazenarMorango() throws Exception {
        if (celeiroCheio()) {
            throw new Exception("Celeiro cheio! Não há espaço disponível.");
        }
        this.qtdeMorangos++;
    }

    public void consumirBatata() throws Exception {
        if (this.qtdeBatatas <= 0) {
            throw new Exception("Não há batatas suficientes no celeiro!");
        }
        this.qtdeBatatas--;
    }

    public void consumirCenoura() throws Exception {
        if (this.qtdeCenouras <= 0) {
            throw new Exception("Não há cenouras suficientes no celeiro!");
        }
        this.qtdeCenouras--;
    }

    public void consumirMorango() throws Exception {
        if (this.qtdeMorangos <= 0) {
            throw new Exception("Não há morangos suficientes no celeiro!");
        }
        this.qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos);
    }

    public double getOcupacao() {
        if (capacidade <= 0) return 0.0;
        return (double) (qtdeBatatas + qtdeCenouras + qtdeMorangos) / capacidade;
    }

    public boolean celeiroCheio() {
        return getEspacoDisponivel() <= 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }
}
