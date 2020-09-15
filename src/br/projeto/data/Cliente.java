package br.projeto.data;

import java.sql.Date;

public class Cliente {

	private int Id_cliente;

	private String Nome_cliente;

	private long cpf_cliente;

	private long Celular1_cliente;

	private long Celular2_cliente;

	private String Endereco_cliente;

	private Date DataEntrada_cliente;
        
        private int id_veiculo;

    /**
     * @return the Id_cliente
     */
    public int getId_cliente() {
        return Id_cliente;
    }

    /**
     * @param Id_cliente the Id_cliente to set
     */
    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    /**
     * @return the Nome_cliente
     */
    public String getNome_cliente() {
        return Nome_cliente;
    }

    /**
     * @param Nome_cliente the Nome_cliente to set
     */
    public void setNome_cliente(String Nome_cliente) {
        this.Nome_cliente = Nome_cliente;
    }

    /**
     * @return the cpf_cliente
     */
    public long getCpf_cliente() {
        return cpf_cliente;
    }

    /**
     * @param cpf_cliente the cpf_cliente to set
     */
    public void setCpf_cliente(long cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    /**
     * @return the Celular1_cliente
     */
    public long getCelular1_cliente() {
        return Celular1_cliente;
    }

    /**
     * @param Celular1_cliente the Celular1_cliente to set
     */
    public void setCelular1_cliente(long Celular1_cliente) {
        this.Celular1_cliente = Celular1_cliente;
    }

    /**
     * @return the Celular2_cliente
     */
    public long getCelular2_cliente() {
        return Celular2_cliente;
    }

    /**
     * @param Celular2_cliente the Celular2_cliente to set
     */
    public void setCelular2_cliente(long Celular2_cliente) {
        this.Celular2_cliente = Celular2_cliente;
    }

    /**
     * @return the Endereco_cliente
     */
    public String getEndereco_cliente() {
        return Endereco_cliente;
    }

    /**
     * @param Endereco_cliente the Endereco_cliente to set
     */
    public void setEndereco_cliente(String Endereco_cliente) {
        this.Endereco_cliente = Endereco_cliente;
    }

    /**
     * @return the DataEntrada_cliente
     */
    public Date getDataEntrada_cliente() {
        return DataEntrada_cliente;
    }

    /**
     * @param DataEntrada_cliente the DataEntrada_cliente to set
     */
    public void setDataEntrada_cliente(Date DataEntrada_cliente) {
        this.DataEntrada_cliente = DataEntrada_cliente;
    }

    /**
     * @return the id_veiculo
     */
    public int getId_veiculo() {
        return id_veiculo;
    }

    /**
     * @param id_veiculo the id_veiculo to set
     */
    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }


}
