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

    public Serie(String episodios, String temporadas, String situacao, 
    String titulo, String genero, String ano, String diretor, String curtida) {
        super(titulo, genero, ano, diretor, curtida);
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
    
    @Override
    public String exibirSituacao(String s){
        switch (s) {
            case "Encerrado":
                return "A série está encerrada";
            case "Em produção":
                return "A série está em fase de produção";
            default:
                return "A série foi cancelada";
        }
    }
}
