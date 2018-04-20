package Agrecacao.model;

import heranca.model.Colaborador;

public class Repositorio {

    private final int MAXIMO = 100;
    private Colaborador[] colaboradores;
    private int cadastrados;

    public Repositorio() {
        this.cadastrados = 0;
        this.colaboradores = new Colaborador[this.MAXIMO];
    }

    public boolean insere(Colaborador c){
        boolean deuCerto = false;
        if(this.cadastrados < this.MAXIMO){
            this.colaboradores[this.cadastrados++] = c;
            deuCerto = true;
        }
        return deuCerto;
    }

    public Colaborador recuperaAt(int position){
        return this.colaboradores[position];
    }

    public boolean delete(int position){
        this.colaboradores[position] = null;
        return true;
    }
}
