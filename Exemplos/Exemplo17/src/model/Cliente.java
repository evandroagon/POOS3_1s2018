package model;

public class Cliente {
    private int senha;
    private boolean preferencial;

    public Cliente(int senha, boolean preferencial) {
        this.senha = senha;
        this.preferencial = preferencial;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(isPreferencial()){
            sb.append("Cliente preferencial: ");
        }else{
            sb.append("Cliente: ");
        }
        sb.append(getSenha());
        return sb.toString();
    }
}
