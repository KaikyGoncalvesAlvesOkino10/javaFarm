package br.com.joaocarloslima;

public class Terreno {
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
        this.batata = null;
        this.cenoura = null;
        this.morango = null;
    }

    public void plantar(Batata batata) throws Exception {
        if (estaOcupado()) {
            throw new Exception("Terreno já ocupado!");
        }
        this.batata = batata;
    }

    public void plantar(Cenoura cenoura) throws Exception {
        if (estaOcupado()) {
            throw new Exception("Terreno já ocupado!");
        }
        this.cenoura = cenoura;
    }

    public void plantar(Morango morango) throws Exception {
        if (estaOcupado()) {
            throw new Exception("Terreno já ocupado!");
        }
        this.morango = morango;
    }

    public void colher(Celeiro celeiro) throws Exception {
        if (!estaOcupado()) {
            throw new Exception("Não há nenhuma planta neste terreno para colher!");
        }

        if (this.batata != null) {
            if (!this.batata.podeColher()) {
                throw new Exception("A batata ainda não está pronta para colheita!");
            }
            celeiro.armazenarBatata();
            celeiro.armazenarBatata();
            this.batata = null;
        } else if (this.cenoura != null) {
            if (!this.cenoura.podeColher()) {
                throw new Exception("A cenoura ainda não está pronta para colheita!");
            }
            celeiro.armazenarCenoura();
            celeiro.armazenarCenoura();
            this.cenoura = null;
        } else if (this.morango != null) {
            if (!this.morango.podeColher()) {
                throw new Exception("O morango ainda não está pronto para colheita!");
            }
            celeiro.armazenarMorango();
            celeiro.armazenarMorango();
            this.morango = null;
        }
    }

    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
