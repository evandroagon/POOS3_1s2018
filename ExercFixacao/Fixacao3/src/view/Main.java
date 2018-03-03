package view;

import model.Aluno;

import javax.swing.*;

public class Main {

    /*
     * O método lerAluno() não faz parte da classe Main, mesmo estando implementado dentro da classe.
     * Quando um objeto Main for instanciado o método não estará disponível pois ele é estático (static).
     *
     * Dessa forma, podemos utilizar o método implementado como um "apoio" à nossa programação.
     *
     * O método recebe os dados referentes a um aluno, instancia um objeto do tipo aluno e devolve-o como retorno.
     */
    public static Aluno lerAluno(){
        Aluno estudante;
        String nome;
        int prontuario;
        double n1, n2, n3, n4;
        nome = JOptionPane.showInputDialog("Nome do aluno: ");
        prontuario = Integer.parseInt(JOptionPane.showInputDialog("Prontuário: "));
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Prova 1:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Prova 2:"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Exercicios:"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Projeto:"));
        estudante = new Aluno(nome, prontuario, n1, n2, n3, n4);
        return estudante;
    }


    public static void main(String[] args) {

        //Declaração de 5 alunos
        Aluno aluno1, aluno2, aluno3, aluno4, aluno5;

        //Variáveis que farão o retorno dos dados solicitados no exercício.
        int aprovados=0, reprovados=0;
        double mediaSala=0;


        //Leitura dos dados dos 5 alunos, um de cada vez utilizando o método lerAluno().
        aluno1 = Main.lerAluno();
        aluno2 = Main.lerAluno();
        aluno3 = Main.lerAluno();
        aluno4 = Main.lerAluno();
        aluno5 = Main.lerAluno();

        //Contando os aprovados e reprovados
        if(aluno1.estaAprovado())
            aprovados+=1;
        else
            reprovados+=1;

        if(aluno2.estaAprovado())
            aprovados++;
        else
            reprovados++;

        if(aluno3.estaAprovado())
            aprovados++;
        else
            reprovados++;

        if(aluno4.estaAprovado())
            aprovados++;
        else
            reprovados++;

        if(aluno5.estaAprovado())
            aprovados++;
        else
            reprovados++;

        //calculando o média da sala
        mediaSala = (aluno1.getMedia() + aluno2.getMedia() + aluno3.getMedia() + aluno4.getMedia() + aluno5.getMedia())/5.0;


        //Exibindo os dados de saída.1
        JOptionPane.showMessageDialog(null, "Alunos aprovados: " + aprovados);
        JOptionPane.showMessageDialog(null, "Alunos Reprovados: " + reprovados);
        JOptionPane.showMessageDialog(null, "Média da turma: " + mediaSala);

    }

}
