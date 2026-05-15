/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ncatjpeg
 */
public class Filme extends Video{
    private String duracao;

    public Filme(String duracao, String titulo, String genero, String ano, String diretor) {
        super(titulo, genero, ano, diretor);
        this.duracao = duracao;
    }

    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
}
