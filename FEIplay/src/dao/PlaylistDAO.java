/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Playlist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlaylistDAO {
    private Connection conn;
    
    public PlaylistDAO(Connection conn){
        this.conn = conn;
    }
    
    public ResultSet consultar(Playlist playlist) throws SQLException{
        String sql = "select * from playlists where playlist = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, playlist.getUsuario().getNome());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
//    public void inserirPlaylist(Playlist playlist) throws SQLException{
//        String sql = "insert into playlists (playlist) values ('"
//                      + playlist.getNome()    + "')" ;
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.execute();
//        conn.close();
//    }
//    
//    public void inserirFilme(Playlist playlist) throws SQLException{
//        String sql = "insert into playlists (usuario, playlist, filme, tipo) values ('"
//                      + playlist.getNome()    + "', '" 
//                      + playlist.getUsuario().getNome() + "', '"
//                      + playlist.getFilme().getTitulo() + "', '"
//                      + "1"   + "')";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.execute();
//        conn.close();
//    }
//    
//    public void inserirSerie(Playlist playlist) throws SQLException{
//        String sql = "insert into playlists (usuario, playlist, serie, tipo) values ('"
//                      + playlist.getNome()    + "', '" 
//                      + playlist.getUsuario().getNome() + "', '"
//                      + playlist.getSerie().getTitulo() + "', '"
//                      + "2"   + "')";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.execute();
//        conn.close();
//    }

//    public void atualizar(Aluno aluno) throws SQLException{
//        String sql = "update alunos set senha =  ? where usuario = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, aluno.getSenha());
//        statement.setString(2, aluno.getUsuario());
//        statement.execute();
//        conn.close();
//    }
    
//    public void remover(Playlist playlist) throws SQLException{
//        String sql = "delete from alunos where usuario = ?";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.setString(1, playlist.getNome());
//        statement.execute();
//        conn.close();
//    }
}
