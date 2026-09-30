package br.com.joaocarloslima;

public class Batata {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Batata() {
        this.tamanho = 1;
        this.tempoDeVida = 0;
        this.tempoDeCrescimento = 1;
    }

    public void crescer() {
        this.tempoDeVida++;
        if (this.tempoDeVida % this.tempoDeCrescimento == 0 && this.tamanho < 4) {
            this.tamanho++;
        }
    }

    public boolean podeColher() {
        return this.tamanho >= 4;
    }

    public String getImagem() {
        return "images/batata" + this.tamanho + ".png";
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }
}
