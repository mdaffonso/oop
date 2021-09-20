package pessoas;

public class AlunoMatricula {
    Aluno aluno;
    int matricula;

    public Aluno getAluno() {
        return aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public AlunoMatricula(Aluno aluno, int matricula) {
        this.aluno = aluno;
        this.matricula = matricula;
    }
}
