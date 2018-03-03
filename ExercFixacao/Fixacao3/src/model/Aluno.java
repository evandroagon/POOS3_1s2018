package model;

public class Aluno {
    /*
     * Definição de constantes com os pesos de cada avaliação.
     * Constantes são, por convenção, declaradas em letras maiúsculas.
     */
    private final double PESO_P1 = 0.15;
    private final double PESO_P2 = 0.15;
    private final double PESO_EX = 0.40;
    private final double PESO_PJ = 0.30;

    private String nome;
    private int prontuario;
    private double prova1;
    private double prova2;
    private double exercicios;
    private double projeto;

    public Aluno() {     }

    public Aluno(String nome, int prontuario, double prova1, double prova2, double exercicios, double projeto) {
        this.nome = nome;
        this.prontuario = prontuario;
        setProva1(prova1);
        setProva2(prova2);
        setExercicios(exercicios);
        setProjeto(projeto);
    }

    /*
     * Médoto que verifica se o aluno está aprovado, ou seja, se possui média maior ou
     * igual a 6.0.
     */
    public boolean estaAprovado(){
        boolean retorno = false;
        if(getMedia() >= 6){
            retorno = true;
        }
        return retorno;
    }

    /*
     * Calcula e retorna a média do aluno considerando os pesos definidos em HARDCODE (código).
     */
    public double getMedia(){
        double media;
        media = prova1 * PESO_P1 + prova2 * PESO_P2 + exercicios * PESO_EX + projeto * PESO_PJ;
        return media;
    }


    /*
     * O método validaNota() verifica se a nota informada é válida, ou seja
     * se a nota está entre 0 e 10. Retorna verdadeiro se a nota é válida e
     * falso se não é válida.
     */
    private boolean validaNota(double nota){
        boolean retorno = false;
        if(nota >= 0 && nota <= 10){
            retorno = true;
        }
        return retorno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }


    /*
     * Para os métodos que recebem as notas é realizado o tratamento de
     * nota válida. Utilizaram-se várias formas de usar o mesmo método.
     */
    public void setProva1(double prova1) {
        this.prova1 = 0;
        if(validaNota(prova1)){
            this.prova1 = prova1;
        }
    }

    public void setProva2(double prova2) {
        this.prova2 = validaNota(prova2)?prova2:0;
    }

    public void setExercicios(double exercicios) {
        this.exercicios = validaNota(exercicios)?exercicios:0;
    }

    public void setProjeto(double projeto) {
        if(validaNota(projeto)){
            this.projeto = projeto;
        }else{
            this.projeto = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getProntuario() {
        return prontuario;
    }

    public double getProva1() {
        return prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public double getExercicios() {
        return exercicios;
    }

    public double getProjeto() {
        return projeto;
    }
}
