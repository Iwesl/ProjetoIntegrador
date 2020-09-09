package br.projeto.data;

public class Tecnico extends Atendente {

	private int id;

	private String nome;

	/**
	 *  @return the id 
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 *  @param id the id to set 
	 * 
	 */
	public void setId(int id) {
                this.id = id;   
	}

	/**
	 *  @return the nome 
	 * 
	 */
	public String getNome() {
		return nome;
	}

	/**
	 *  @param nome the nome to set 
	 * 
	 */
	public void setNome(String nome) {
                this.nome = nome;
	}

}
