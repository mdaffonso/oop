package cursos;

import pessoas.Aluno;
import pessoas.AlunoMatricula;
import pessoas.Professor;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Disciplina disciplina;
    private Turno turno;
    private List<AlunoMatricula> alunos;
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

    public List<AlunoMatricula> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        if (alunos == null) return;
        List<AlunoMatricula> lista = new ArrayList<>();
        for (int i = 0; i < alunos.size(); i++) {
            lista.add(new AlunoMatricula(alunos.get(i), i+1));
        }
        this.alunos = lista;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    private int getLastKey() {
        int ultimoRegistro = 1;

        for (AlunoMatricula aluno : alunos) {
            if (aluno.getMatricula() > ultimoRegistro) {
                ultimoRegistro = aluno.getMatricula();
            }
        }
        return ultimoRegistro;
    }

    public void adicionarAluno(Aluno aluno) {
        int matricula = getLastKey() + 1;
        alunos.add(new AlunoMatricula(aluno, matricula));
    }
}
