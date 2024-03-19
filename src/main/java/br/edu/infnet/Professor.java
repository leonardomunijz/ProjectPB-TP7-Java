package br.edu.infnet;

public class Professor {
    private String nome;
    private int matricula;
    private String endereco;
    private String telefone;
    private String titulacao;
    private String formaContratacao;
    private String curriculoResumido;

    public Professor(String nome, int matricula, String endereco, String telefone, String titulacao, String formaContratacao, String curriculoResumido) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
        this.titulacao = titulacao;
        this.formaContratacao = formaContratacao;
        this.curriculoResumido = curriculoResumido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getFormaContratacao() {
        return formaContratacao;
    }

    public void setFormaContratacao(String formaContratacao) {
        this.formaContratacao = formaContratacao;
    }

    public String getCurriculoResumido() {
        return curriculoResumido;
    }

    public void setCurriculoResumido(String curriculoResumido) {
        this.curriculoResumido = curriculoResumido;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Endereço: " + endereco + ", Telefone: " + telefone + ", Titulação: " + titulacao + ", Forma de Contratação: " + formaContratacao + ", Currículo Resumido: " + curriculoResumido;
    }
}
