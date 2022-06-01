package SistemaAcademico.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import SistemaAcademico.Model.Curso;

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
}
