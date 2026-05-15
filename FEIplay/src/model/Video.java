package model;

public abstract class Video {
    protected String titulo, genero, ano, diretor, curtida;

    public Video(String titulo, String genero, String ano, 
                 String diretor, String curtida) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.diretor = diretor;
        this.curtida = curtida;
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

    public String getCurtida() {
        return curtida;
    }
    public void setCurtida(String curtida) {
        this.curtida = curtida;
    }
    
    
    
}
