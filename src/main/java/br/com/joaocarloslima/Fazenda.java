package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        this.celeiro = new Celeiro();
        this.terrenos = new ArrayList<>();
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public void plantarBatata(int x, int y) throws Exception {
        Terreno terreno = getTerreno(x, y);
        if (terreno == null) {
            throw new Exception("Posição do terreno inválida!");
        }
        celeiro.consumirBatata();
        terreno.plantar(new Batata());
    }

    public void plantarCenoura(int x, int y) throws Exception {
        Terreno terreno = getTerreno(x, y);
        if (terreno == null) {
            throw new Exception("Posição do terreno inválida!");
        }
        celeiro.consumirCenoura();
        terreno.plantar(new Cenoura());
    }

    public void plantarMorango(int x, int y) throws Exception {
        Terreno terreno = getTerreno(x, y);
        if (terreno == null) {
            throw new Exception("Posição do terreno inválida!");
        }
        celeiro.consumirMorango();
        terreno.plantar(new Morango());
    }

    public Terreno getTerreno(int x, int y) {
        for (Terreno t : terrenos) {
            if (t.getX() == x && t.getY() == y) {
                return t;
            }
        }
        return null;
    }

    public void colher(int x, int y) throws Exception {
        Terreno terreno = getTerreno(x, y);
        if (terreno == null) {
            throw new Exception("Posição do terreno inválida!");
        }
        terreno.colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public List<Terreno> getTerrenos() {
        return terrenos;
    }
}
