package controller;

import view.InfoSerie;

public class ControleInfoSerie {
    private InfoSerie tela6;
    
    public ControleInfoSerie(InfoSerie tela5){
        this.tela6 = tela6;
    }
    
    public void fechar(){
        tela6.setVisible(false);
    }
}
