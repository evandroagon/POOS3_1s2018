public class Aluno {

    private String nome;
    private static int quantidade=0;

    public Aluno(String nome) {
        this.nome = nome;
        quantidade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("José");
        Aluno a2 = new Aluno("João");
        Aluno a3 = new Aluno("Caio");
        Aluno aN;

        System.out.println("Quantidade: " + Aluno.getQuantidade());
        for(int i=0; i<10; i++){
            aN = new Aluno("Gasparzinho");
        }
        System.out.println("Quantidade: " + Aluno.getQuantidade());
    }
}
