package controller;

import view.InfoFilme;

public class ControleInfoFilme {
    private InfoFilme tela5;
    
    public ControleInfoFilme(InfoFilme tela5){
        this.tela5 = tela5;
    }
    
    public void fechar(){
        tela5.setVisible(false);
    }
    
    
}
