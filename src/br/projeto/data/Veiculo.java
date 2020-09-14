/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.data;

/**
 *
 * @author Igor
 */
public class Veiculo {
    
        private int id_veiculo;

	private String modelo_veiculo;

	private String marca_veiculo;
        
        private String cor_veiculo;

	private String placa_veiculo;
        
        private int id_cliente;

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

    /**
     * @return the modelo_veiculo
     */
    public String getModelo_veiculo() {
        return modelo_veiculo;
    }

    /**
     * @param modelo_veiculo the modelo_veiculo to set
     */
    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }

    /**
     * @return the marca_veiculo
     */
    public String getMarca_veiculo() {
        return marca_veiculo;
    }

    /**
     * @param marca_veiculo the marca_veiculo to set
     */
    public void setMarca_veiculo(String marca_veiculo) {
        this.marca_veiculo = marca_veiculo;
    }

    /**
     * @return the cor_veiculo
     */
    public String getCor_veiculo() {
        return cor_veiculo;
    }

    /**
     * @param cor_veiculo the cor_veiculo to set
     */
    public void setCor_veiculo(String cor_veiculo) {
        this.cor_veiculo = cor_veiculo;
    }

    /**
     * @return the placa_veiculo
     */
    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    /**
     * @param placa_veiculo the placa_veiculo to set
     */
    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}
