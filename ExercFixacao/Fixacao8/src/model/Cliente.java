package model;

/**
 * Classe que representa um Cliente em nossa fila bancária.
 */
public class Cliente {

    private int senha;
    private boolean prioritario;

    /**
     * Construtor que instancia um objeto com uma senha definida e a indicação se é ou
     * não um cliente prioritário. O Cliente não verifica se a senha é única, essa atividade
     * deve ser implementada pelo gerenciador de clientes.
     *
     * @param senha
     * @param prioritario
     */
    public Cliente(int senha, boolean prioritario) {
        this.senha = senha;
        this.prioritario = prioritario;
    }

    /**
     * Informa a senha do cliente
     * @return
     */
    public int getSenha() {
        return senha;
    }

    /**
     * Informa se o cliente é ou não prioritário
     * @return
     */
    public boolean isPrioritario() {
        return prioritario;
    }

}
