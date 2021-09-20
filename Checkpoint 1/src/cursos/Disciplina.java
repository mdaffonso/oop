package cursos;

public enum Disciplina {
    INGLES("Inglês", 70000),
    INFORMATICA("Informática", 80000),
    ADMINISTRACAO("Administração", 85000);

    private String disciplina;
    private int preco;

    Disciplina(String disciplina, int preco) {
        this.disciplina = disciplina;
        this.preco = preco;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getPreco() {
        return preco;
    }
}
