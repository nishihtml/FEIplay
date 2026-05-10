package controller;

import dao.UsuarioDAO;
import dao.Conexao;
import model.Usuario;
import view.Login;
//import view.Logado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleLogin{
    private Login tela1;
    
    public ControleLogin(Login tela1){
        this.tela1 = tela1;
    }
    
     public void logarUsuario(){
        Usuario usuario = new Usuario(null,tela1.getTxt_usuario().getText(),tela1.getTxt_senha().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if(res.next()){
                JOptionPane.showMessageDialog(tela1, "Login efetuado", "Aviso", 
                                                JOptionPane.INFORMATION_MESSAGE);
                String n = res.getString("nome");
                String u = res.getString("usuario");
                String s = res.getString("senha");
//                Logado tela2 = new Logado(new Usuario(n, u, s));
//                tela2.setVisible(true);
//                tela1.setVisible(false);
            } else{
                JOptionPane.showMessageDialog(tela1, "Login não efetuado", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
                
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(tela1, "Erro de conexão", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }
}

