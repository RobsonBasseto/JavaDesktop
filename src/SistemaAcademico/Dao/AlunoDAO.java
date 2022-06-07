
package SistemaAcademico.Dao;

import SistemaAcademico.Model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;



public class AlunoDAO {
    public void cadastrarAluno(Aluno aluno) throws ExceptionDAO
    {
        String sql = "insert into aluno(nomealuno, cpf, email, endereco, idcurso) values (?,?,?,?,?);";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try
        {
            connection = new ConnectionDataBase().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, aluno.getNomealuno());
            pStatement.setString(2, aluno.getCpf());
            pStatement.setString(3, aluno.getEmail());
            pStatement.setString(4, aluno.getEndereco());
            pStatement.setInt(5, aluno.());
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
