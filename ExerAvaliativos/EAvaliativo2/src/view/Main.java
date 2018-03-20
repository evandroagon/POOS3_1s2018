package view;


import model.Jogada;

import javax.swing.*;

public class Main {

    private static final String PLAY_NAME = "Jogatina de POO";

    public static void main(String[] args) {

        Jogada player;
        int dialogResult;
        int parcial, lances = 0, total=0;
        String mensagem;

        player = new Jogada();

        do{
            JOptionPane.showMessageDialog(null, "Pressione OK para jogar os dados.", PLAY_NAME, JOptionPane.INFORMATION_MESSAGE);
            player.realizarJogada();
            lances++;
            parcial = player.getResultadoJogada();
            total += parcial;
            mensagem = "Resultado da Jogada: " + parcial + "\nResultado acumulado em " + lances + " jogada(s): " + total + "\n";

            JOptionPane.showMessageDialog(null, mensagem, PLAY_NAME, JOptionPane.INFORMATION_MESSAGE);

            dialogResult = JOptionPane.showConfirmDialog(null, "Deseja lançar dados novamente?", PLAY_NAME, JOptionPane.YES_NO_OPTION);
        }while (lances <= 3 && dialogResult == JOptionPane.YES_OPTION);
    }

}
