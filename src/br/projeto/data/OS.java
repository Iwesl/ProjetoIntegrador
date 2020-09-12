/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.data;

import java.util.Date;


/**
 *
 * @author Igor
 */
public class OS {
    
        private int Numero_OS;
	private String Defeito_OS;
	private String Status_OS;
	private Date DataAbertura_OS;
	private Date DataFechamento_OS;
    
    public static void main(String[] args) throws Exception {
       
    }

    public void AbrirNovaOs() {

    }    

    /**
     * @return the Numero_OS
     */
    public int getNumero_OS() {
        return Numero_OS;
    }

    /**
     * @param Numero_OS the Numero_OS to set
     */
    public void setNumero_OS(int Numero_OS) {
        this.Numero_OS = Numero_OS;
    }

    /**
     * @return the Defeito_OS
     */
    public String getDefeito_OS() {
        return Defeito_OS;
    }

    /**
     * @param Defeito_OS the Defeito_OS to set
     */
    public void setDefeito_OS(String Defeito_OS) {
        this.Defeito_OS = Defeito_OS;
    }

    /**
     * @return the Status_OS
     */
    public String getStatus_OS() {
        return Status_OS;
    }

    /**
     * @param Status_OS the Status_OS to set
     */
    public void setStatus_OS(String Status_OS) {
        this.Status_OS = Status_OS;
    }

    /**
     * @return the DataAbertura_OS
     */
    public Date getDataAbertura_OS() {
        return DataAbertura_OS;
    }

    /**
     * @param DataAbertura_OS the DataAbertura_OS to set
     */
    public void setDataAbertura_OS(Date DataAbertura_OS) {
        this.DataAbertura_OS = DataAbertura_OS;
    }

    /**
     * @return the DataFechamento_OS
     */
    public Date getDataFechamento_OS() {
        return DataFechamento_OS;
    }

    /**
     * @param DataFechamento_OS the DataFechamento_OS to set
     */
    public void setDataFechamento_OS(Date DataFechamento_OS) {
        this.DataFechamento_OS = DataFechamento_OS;
    }
}
