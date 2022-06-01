package SistemaAcademico.Controller;

import SistemaAcademico.Model.Aluno;

public class ControllerAluno {
    
    public boolean cadastrarAluno(String nomealuno, String cpf, String email, String endereco,int idcurso){
    
        if(nomealuno != null && nomealuno.length()>0 && validarCPF(cpf) && email != null && email.length()>0 && endereco != null && endereco.length()>0 && idcurso>0)
        {
            Aluno a = new Aluno();
            a.cadastrarAluno(a);
            return true;
        }
        return false;
    }
    
    public boolean validarCPF(String cpf)
    {
        for(int i=0; i<cpf.length(); i++)
        {
            if(!Character.isDigit(cpf.charAt(i)))
            {
                if(!(i==3 || i==7 || i==11))
                {
                    return false;
                }
            
               
            }
        }
        return true;
    }
}

