package controller;

import dao.Conexao;
import dao.VideoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Serie;
import view.InfoSerie;

public class ControleInfoSerie {
    private InfoSerie tela6;
    private Serie serie;
    
    public ControleInfoSerie(InfoSerie tela6, Serie serie){
        this.tela6 = tela6;
        this.serie = serie;
    }
    
    public void fechar(){
        tela6.setVisible(false);
    }
    
    public void alterarSerie(){
        String titulo = serie.getTitulo();
//        String novaSenha = tela6.getTxtNovaSenha().getText();
        Serie serie = new Serie(null, null, null, titulo, null, null, null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            VideoDAO dao = new VideoDAO(conn);
            dao.alterarSerie(serie);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(tela6, "Falha de conexão!", 
                                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
