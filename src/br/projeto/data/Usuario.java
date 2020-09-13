package br.projeto.data;

/**
 *
 * @author Igor
 */

public class Usuario {

    	private int id_usuario;

	private String nome_usuario;

	private long cpf_usuario;
        
	private String password_usuario;

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    /**
     * @return the cpf_usuario
     */
    public long getCpf_usuario() {
        return cpf_usuario;
    }

    /**
     * @param cpf_usuario the cpf_usuario to set
     */
    public void setCpf_usuario(long cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    /**
     * @return the password_usuario
     */
    public String getPassword_usuario() {
        return password_usuario;
    }

    /**
     * @param password_usuario the password_usuario to set
     */
    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }
        


}
