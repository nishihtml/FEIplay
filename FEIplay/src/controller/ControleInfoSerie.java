/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.InfoSerie;

/**
 *
 * @author ncatjpeg
 */
public class ControleInfoSerie {
    private InfoSerie tela6;
    
    public ControleInfoSerie(InfoSerie tela5){
        this.tela6 = tela6;
    }
    
    public void fechar(){
        tela6.setVisible(false);
    }
}
