
package controller;

import java.sql.Connection;
import dao.Conexao;
import dao.PlaylistDAO;
import dao.VideoDAO;
import model.Filme;
import model.Serie;
import view.Index;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Playlist;
import view.InfoFilme;
import view.InfoSerie;

public class ControleIndex {
    private Index tela4;
    
    public ControleIndex(Index tela4){
        this.tela4 = tela4;
    }
    
    public void BuscarFilme(){
        Filme filme = new Filme(null, tela4.getTxt_busca().getText(),
                                null, null, null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            VideoDAO dao= new VideoDAO(conn);
            ResultSet res = dao.consultarFilme(filme);
            if(res.next()){
                String duracao = res.getString("duracao");
                String titulo = res.getString("titulo");
                String ano = res.getString("ano");
                String diretor = res.getString("diretor");
                String genero = res.getString("genero");
                String curtida = res.getString("curtida");
                InfoFilme tela5 = new InfoFilme(new Filme(duracao, titulo, 
                                            genero, ano, diretor, curtida));
                tela5.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(tela4, "Filme não encontrado", 
                                            "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(tela4, "Erro de conexão", "Erro", 
                                                    JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void BuscarSerie(){
        Serie serie = new Serie(null, null, null,
                tela4.getTxt_busca().getText(), null, null, null, null);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            VideoDAO dao= new VideoDAO(conn);
            ResultSet res = dao.consultarSerie(serie);
            if(res.next()){
                String episodios = res.getString("episodios");
                String temporadas = res.getString("temporadas");
                String situacao = res.getString("situacao");
                String titulo = res.getString("titulo");
                String ano = res.getString("ano");
                String diretor = res.getString("diretor");
                String genero = res.getString("genero");
                String curtida = res.getString("curtida");
                InfoSerie tela6 = new InfoSerie(new Serie(episodios, temporadas,
                              situacao, titulo, genero, ano, diretor, curtida));
                tela6.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(tela4, "Serie não encontrada", 
                                            "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(tela4, "Erro de conexão", "Erro", 
                                                    JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
//    public void criarPlaylist(){
//        Usuario user;
//        String n = tela4.getTxt_playlist().getText();
//        
//        Playlist playlist = new Playlist(n, null, null, null);
//        Conexao conexao = new Conexao();
//        try {
//            Connection conn = conexao.getConnection();
//            PlaylistDAO dao = new PlaylistDAO(conn);
//            dao.inserirPlaylist(playlist);
//            JOptionPane.showMessageDialog(tela4, "Playlist criado!","Aviso", 
//                                        JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(tela4, "Playlist não foi criado!","Erro", 
//                                        JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    
//        Aluno aluno = new Aluno(null,tela1.getTxtUsuario().getText(),tela1.getTxtSenha().getText());
//        Conexao conexao = new Conexao();
//        try{
//            Connection conn = conexao.getConnection();
//            AlunoDAO dao = new AlunoDAO(conn);
//            ResultSet res = dao.consultar(aluno);
//            if(res.next()){
//                JOptionPane.showMessageDialog(tela1, "Login efetuado", "Aviso", 
//                                                JOptionPane.INFORMATION_MESSAGE);
//                String nome = res.getString("nome");
//                String usuario = res.getString("usuario");
//                String senha = res.getString("senha");
//                Logado tela2 = new Logado(new Aluno(nome, usuario, senha));
//                tela2.setVisible(true);
//                tela1.setVisible(false);
//            } else{
//                JOptionPane.showMessageDialog(tela1, "Login não efetuado", "Erro", 
//                                                JOptionPane.ERROR_MESSAGE);
//                
//            }
//        } catch(SQLException e){
//            JOptionPane.showMessageDialog(tela1, "Erro de conexão", "Erro", 
//                                                JOptionPane.ERROR_MESSAGE);
//        }
//    }
}

