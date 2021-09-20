package cursos;

import pessoas.Aluno;
import pessoas.Professor;

import java.util.List;

public class Curso {
    private Disciplina disciplina;
    private Turno turno;
    private List<Aluno> alunos;
    private Professor professor;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
        gerarMatriculas();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void gerarMatriculas() {
        for (int i = 1; i <= alunos.size(); i++) {
            alunos.get(i - 1).setNumeroDeMatricula(i);
        }
    }
}
