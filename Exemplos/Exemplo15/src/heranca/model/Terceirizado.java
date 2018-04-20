package heranca.model;

public class Terceirizado extends Colaborador {

    private String empresa;

    public Terceirizado(String nome, String CPF, String empresa) {
        super(nome, CPF);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
