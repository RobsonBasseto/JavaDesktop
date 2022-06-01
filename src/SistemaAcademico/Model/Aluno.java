package SistemaAcademico.Model;

public class Aluno {
    
    private int idaluno;
    private String nomealuno;
    private String cpf;
    private String email;
    private String endereco;
    private int idcurso;

    public int getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(int idaluno) {
        this.idaluno = idaluno;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }
    
    public void cadastrarAluno(Aluno aluno){
    }

    public Aluno() {
    }

    public Aluno(int idaluno, String nomealuno, String cpf, String email, String endereco, int idcurso) {
        this.idaluno = idaluno;
        this.nomealuno = nomealuno;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.idcurso = idcurso;
    }
    
}
