package model;

import java.util.Random;

/**
 * Classe Dado que representa um dado f&iacute;sico. Um dado ter&aacute; sempre uma face em evid&ecirc;ncia,
 * ou seja, uma face voltada para cima.
 *
 * @author ednilsonrossi
 * @version 1.0
 */

public class Dado {
    private int qtdFaces;
    private int face;

    /**
     * Construtor de Dado. Como o dado f&iacute;sico deve com uma face voltada para cima,
     * definiu-se que ao criar o dado a face 1 est&aacute; para cima.
     */
    public Dado(){
        face = 1;
        setQtdFaces(6);
    }

    /**
     *
     * @return A face do dado que est&aacute; em evid&ecirc;ncia (voltada para cima)
     */
    public int getFace() {
        return face;
    }

    /**
     *
     * @return A quantidade de faces que o dado possui.
     */
    public int getQtdFaces() {
        return qtdFaces;
    }

    /**
     * Configura a quantidade de faces que o dado possui.
     *
     * @param qtdFaces que indica a quantidade de faces. Considera-se que o m&iacute;nimo
     *                 de faces de um dado &eacute; 6.
     */
    protected void setQtdFaces(int qtdFaces) {
        this.qtdFaces = qtdFaces < 6 ? 6 : qtdFaces;
    }


    /**
     * Rola o dado para que seja realizado um sorteio considerando a quantidade de faces
     * do dado. Para obter o resultado do m&eacute;todo deve-se recuperar a face do dado com o
     * m&eacute;todo <code>getDado()</code>.
     */
    public void jogarDado(){
        Random random = new Random();
        face = random.nextInt(getQtdFaces()) + 1;
    }
}
