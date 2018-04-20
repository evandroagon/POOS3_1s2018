package composicao.model;

public class Aluno {
    private int prontuario;
    private String nome;
    private Nota[] notas;

    public Aluno(int prontuario, String nome, Nota nota1, Nota nota2, Nota nota3, Nota nota4) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.notas = new Nota[4];
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        this.notas[3] = nota4;
    }

    public Aluno(int prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.notas = new Nota[4];
        for(int i=0; i<4; i++)
            this.notas[i] = null;
    }

    public double getMedia(){
        double media;
        double somaPeso;

        media = 0;
        somaPeso = 0;
        for(int i=0; i<4; i++){
            if(this.notas[i] == null){
                media = 0;
                i = 5;
            }else{
                media += this.notas[i].getValor() * this.notas[i].getPeso();
                somaPeso += this.notas[i].getPeso();
            }
        }
        if(media > 0 && somaPeso != 0){
            media = media / somaPeso;
        }
        return media;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
