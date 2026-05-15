package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import view.Cadastro;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class ControleCadastro {
    private Cadastro tela3;
    
    public ControleCadastro(Cadastro tela3){
        this.tela3 = tela3;
    }
    
    public void cadastrarUsuario(){
        String n = tela3.getTxt_nome().getText();
        String u = tela3.getTxt_usuario().getText();
        String s = tela3.getTxt_senha().getText();
        Usuario usuario = new Usuario(n, u, s);
        
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.inserir(usuario);
            JOptionPane.showMessageDialog(tela3, "Usuario Cadastrado!","Aviso", 
                                        JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(tela3, "Usuário não cadastrado!","Erro", 
                                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
