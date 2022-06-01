package SistemaAcademico.Controller;

import SistemaAcademico.Dao.ExceptionDAO;
import SistemaAcademico.Model.Curso;

public class ControllerCurso {
    
    public boolean cadastrarCurso(String descricao, int cargahoraria) throws ExceptionDAO{
    
        if(descricao != null && descricao.length()>0 && cargahoraria>0)
        {
            Curso c = new Curso(descricao,cargahoraria);
            c.cadastrarCurso(c);
            return true;
        }
        return false;
    }
}