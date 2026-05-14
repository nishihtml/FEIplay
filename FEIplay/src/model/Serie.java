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
    private int episodios, temporadas;

    public Serie(int episodios, int temporadas, String titulo, String descricao, String genero, String ano, String diretor) {
        super(titulo, descricao, genero, ano, diretor);
        this.episodios = episodios;
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
