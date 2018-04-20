package heranca.model;

public class Funcionario extends Colaborador implements Iponto{
    private final int MAX = 1000;
    private String[] registroPonto;
    private int ultimoRegistro;

    public Funcionario(String nome, String CPF) {
        super(nome, CPF);
        this.registroPonto = new String[this.MAX];
        this.ultimoRegistro = -1;
    }

    @Override
    public void registrarEntrada(String agora) {
        agora = "ENTRADA: " + agora;
        registrar(agora);
    }

    @Override
    public void registrarSaida(String agora) {
        agora = "SAÍDA: " + agora;
        registrar(agora);
    }

    private void registrar(String txt){
        if(this.ultimoRegistro < this.MAX){
            this.ultimoRegistro += 1;
            this.registroPonto[this.ultimoRegistro] = txt;
        }
    }
}
