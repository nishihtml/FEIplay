/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Filme;
import model.Serie;


public class VideoDAO {
    private Connection conn;
    
    public VideoDAO(Connection conn){
        this.conn = conn;
    }
    
    public ResultSet consultarFilme(Filme filme) throws SQLException{
        String sql = "select * from videos where titulo = ? and tipo = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, filme.getTitulo());
        statement.setString(2, "1");
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public ResultSet consultarSerie(Serie serie) throws SQLException{
        String sql = "select * from videos where titulo = ? and tipo = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, serie.getTitulo());
        statement.setString(2, "2");
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void alterarFilme(Filme filme) throws SQLException{
        String sql = "update videos set curtida =  ? where titulo = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(2, filme.getTitulo());
        if(filme.getCurtida().equals("1")){
            statement.setString(1, "0");
        }else{
            statement.setString(1, "1");
        }
        statement.execute();
        conn.close();
    }
    
    public void alterarSerie(Serie serie) throws SQLException{
        String sql = "update videos set curtida =  ? where titulo = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(2, serie.getTitulo());
        if(serie.getCurtida().equals("1")){
            statement.setString(1, "0");
        }else{
            statement.setString(1, "1");
        }
        statement.execute();
        conn.close();
    }
//    public void inserir(Usuario usuario) throws SQLException{
//        String sql = "insert into usuarios (nome, usuario, senha) values ('"
//                      + usuario.getNome()    + "', '" 
//                      + usuario.getUsuario() + "', '"
//                      + usuario.getSenha()   + "')";
//        PreparedStatement statement = conn.prepareStatement(sql);
//        statement.execute();
//        conn.close();
//    } 
}
