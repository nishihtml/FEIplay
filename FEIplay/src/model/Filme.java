package model;

public class Filme extends Video{
    private String duracao;

    public Filme(String duracao, String titulo, String genero, String ano,
                                 String diretor, String curtida) {
        super(titulo, genero, ano, diretor, curtida);
        this.duracao = duracao;
    }

    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
}
