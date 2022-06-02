package SistemaAcademico.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import SistemaAcademico.Model.Curso;
import java.util.ArrayList;

public class CursoDAO {
    
    public void cadastrarCurso(Curso curso) throws ExceptionDAO
    {
        String sql = "insert into curso(descricao, cargahoraria) values (?,?);";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try
        {
            connection = new ConnectionDataBase().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, curso.getDescricao());
            pStatement.setInt(2, curso.getCargahoraria());
            pStatement.execute();
        }
        catch(SQLException e)
        {
            throw new ExceptionDAO("Erro ao cadastrar curso:" + e);
            
        }
        finally
        {
            try
            {
                if(pStatement != null){pStatement.close();}
            }
            catch(SQLException e)
            {
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
            }
            try
            {
                if(connection != null) {connection.close();}
            }
            catch(SQLException e)
            {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
        }
    }
    
    public ArrayList<Curso> listarCurso() throws ExceptionDAO
    {
       String sql = "select * from curso";
       
       Connection connection = null;
       
       PreparedStatement pStatement = null;
       ArrayList<Curso> cursos = null;
       
       try
       {
           connection = new ConnectionDataBase().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet rs = pStatement.executeQuery();
           
           if(rs!=null)
           {
               cursos = new ArrayList<Curso>();
               
               while(rs.next())
               {
                   Curso curso = new Curso();
                   curso.setIdcurso(rs.getInt("idcurso"));
                   curso.setDescricao(rs.getString("descricao"));
                   curso.setCargahoraria(rs.getInt("cargahoraria"));
                   cursos.add(curso);
                   
               }
           }
       }
       catch(SQLException e)
       {
           throw new ExceptionDAO("Erro ao listar os cursos: " + e);
       }
       finally
       {
           try
           {
               if(pStatement != null)
               {
                    pStatement.close();
               }
           }
           catch(SQLException e)
           {
               throw new ExceptionDAO("Erro ao fechar o Statement: " + e);
           }
           
           try
            {
                if(connection != null) {connection.close();}
            }
            catch(SQLException e)
            {
                throw new ExceptionDAO("Erro ao fechar a conexão: " + e);
            }
       }
          
       
       return cursos;
    }
}
