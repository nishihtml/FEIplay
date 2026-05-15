/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ncatjpeg
 */
public class Serie extends Video implements Situacao{
    private String episodios, temporadas, situacao;

    public Serie(String episodios, String temporadas, String titulo, String genero, String ano, String diretor, String situacao) {
        super(titulo, genero, ano, diretor);
        this.episodios = episodios;
        this.temporadas = temporadas;
        this.situacao = situacao;
    }

    public String getEpisodios() {
        return episodios;
    }
    public void setEpisodios(String episodios) {
        this.episodios = episodios;
    }

    public String getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
}
