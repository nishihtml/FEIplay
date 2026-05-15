package controller;

import dao.Conexao;
import dao.VideoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Filme;
import view.InfoFilme;

public class ControleInfoFilme {
    private InfoFilme tela5;
    private Filme filme;
    
    public ControleInfoFilme(InfoFilme tela5, Filme filme){
        this.tela5 = tela5;
        this.filme = filme;
    }
    
    public void fechar(){
        tela5.setVisible(false);
    }
    
    public void alterarFilme(){
        String titulo = filme.getTitulo();
//        String novaSenha = tela6.getTxtNovaSenha().getText();
        Filme filme = new Filme(titulo, null, null, null, null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            VideoDAO dao = new VideoDAO(conn);
            dao.alterarFilme(filme);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(tela5, "Falha de conexão!", 
                                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
