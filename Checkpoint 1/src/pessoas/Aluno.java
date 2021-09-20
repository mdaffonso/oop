package pessoas;

public class Aluno {
    private Pessoa dadosPessoais;
    private int numeroDeMatricula;

    public Pessoa getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(Pessoa dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
}
