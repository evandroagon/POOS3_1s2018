public class Estudante {

    private String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Estudante caio;
        Estudante frodo;

        caio = new Estudante("Caio");
        frodo = new Estudante("Gabriel");

        System.out.println(caio.getNome());
        System.out.println(frodo.getNome());
    }
}
