/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naval;

/**
 *
 * @author andre torres
 */
public class Navio {
    
    private String nome;
    private float comprimento;
    private String matricula;

/**
 *
 * @author matrivula 
 */    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public String toString(){
        return nome+ ":" + matricula;
    }
    
}
