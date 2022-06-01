package SistemaAcademico.Model;

import SistemaAcademico.Dao.CursoDAO;
import SistemaAcademico.Dao.ExceptionDAO;

public class Curso {
    
    private int idcurso;
    private String descricao;
    private int cargahoraria;

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public void cadastrarCurso(Curso curso) throws ExceptionDAO{
        new CursoDAO().cadastrarCurso(curso);
    }
    
    public Curso() {
        
    }

    public Curso(String descricao, int cargahoraria) {
        this.descricao = descricao;
        this.cargahoraria = cargahoraria;   
    }
    
    public Curso(int idcurso, String descricao, int cargahoraria) {
        this.idcurso = idcurso;
        this.descricao = descricao;
        this.cargahoraria = cargahoraria;
    }
    
    
}
