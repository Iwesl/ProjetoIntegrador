package br.projeto.data;

public class Peca {

	private int id_pecas;
        
        private String nome_pecas;

	private int quantidade_pecas;

	private double valor_pecas;

    /**
     * @return the id_pecas
     */
    public int getId_pecas() {
        return id_pecas;
    }

    /**
     * @param id_pecas the id_pecas to set
     */
    public void setId_pecas(int id_pecas) {
        this.id_pecas = id_pecas;
    }

    /**
     * @return the quantidade_pecas
     */
    public int getQuantidade_pecas() {
        return quantidade_pecas;
    }

    /**
     * @param quantidade_pecas the quantidade_pecas to set
     */
    public void setQuantidade_pecas(int quantidade_pecas) {
        this.quantidade_pecas = quantidade_pecas;
    }

    /**
     * @return the valor_pecas
     */
    public double getValor_pecas() {
        return valor_pecas;
    }

    /**
     * @param valor_pecas the valor_pecas to set
     */
    public void setValor_pecas(double valor_pecas) {
        this.valor_pecas = valor_pecas;
    }

    /**
     * @return the nome_pecas
     */
    public String getNome_pecas() {
        return nome_pecas;
    }

    /**
     * @param nome_pecas the nome_pecas to set
     */
    public void setNome_pecas(String nome_pecas) {
        this.nome_pecas = nome_pecas;
    }

}
