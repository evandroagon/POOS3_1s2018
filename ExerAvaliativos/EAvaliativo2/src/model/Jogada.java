package model;


/**
 * Classe Jogada simula uma m&atilde;o de jogo de dados.
 *
 * Por exemplo:
 *      Um jogador pode ter em sua m&atilde;o dois dados de seis faces, ao lan&ccedil;ar os dados o resultado esperado
 *      &eacute; um valor entre 2 e 12, isso porque o valor m&iacute;nimo de 2 dados &eacute; 2 e o m&aacute;ximo &eacute; 12.
 *
 * @author ednilsonrossi
 */
public class Jogada {

    private int qtdDadosEmJogo;
    private Dado[] dados;

    /**
     * Construtor que define o objeto Jogada com dois dados. Os Dados s&atilde;o
     * inst&acirc;nciados e est&atilde;o prontos para serem lan&ccedil;ados.
     */
    public Jogada() {
        setQtdDadosEmJogo(2);
        iniciarDado();
    }

    /**
     * Configura a quantidade de dados que faz parte da jogada.
     *
     * @param qtdDadosEmJogo que indica a quantidade de dados que est&atilde;o em jogo. O valor m&iacute;nimo
     *                       aceito &eacute; de 1 dado. N&atilde;o existe um valor m&aacute;ximo.
     */
    protected void setQtdDadosEmJogo(int qtdDadosEmJogo) {
        this.qtdDadosEmJogo = qtdDadosEmJogo >= 1? qtdDadosEmJogo : 1;
    }

    /**
     * Inicia os dados da Jogada. Os objetos da classe Dado s&atilde;o inst&acirc;nciados.
     */
    protected void iniciarDado(){
        if(qtdDadosEmJogo > 0) {
            dados = new Dado[qtdDadosEmJogo];
            for(int i=0; i < qtdDadosEmJogo; i++){
                dados[i] = new Dado();
            }
        }else{
            dados = null;
        }
    }

    /**
     * Joga ou lan&ccedil;a os dados que est&atilde;o na m&atilde;o do jogoador.
     */
    public void realizarJogada(){
        for(int i=0; i<this.qtdDadosEmJogo; i++){
            dados[i].jogarDado();
        }
    }

    /**
     * Em um jogo de dados, considerando dados de seis faces e dois dados por jogada, obtem-se um valor
     * entre 2 e 12. O valor m&iacute;nimo de cada dado &eacute; 1, dessa forma, a soma de dois m&iacute;nimos &eacute; 2. Da mesma forma
     * o valor m&aacute;ximo de cada dado &eacute; 6, e a soma de 2 dados &eacute; 12.
     *
     *
     * @return A soma dos dados lan&ccedil;ados.
     */
    public int getResultadoJogada(){
        int soma = 0;
        for(int i=0; i < qtdDadosEmJogo; i++){
            soma += dados[i].getFace();
        }
        return soma;
    }
}
