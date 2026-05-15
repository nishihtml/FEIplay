package model;

public abstract class Video {
    protected String titulo, genero, ano, diretor;

    public Video(String titulo, String genero, String ano, String diretor) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    } 
    
}
