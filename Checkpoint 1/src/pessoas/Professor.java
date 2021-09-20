package pessoas;

public class Professor {
    private Pessoa dadosPessoais;
    private int valorHora;
    Formacao formacao;

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public Pessoa getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(Pessoa dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
}
