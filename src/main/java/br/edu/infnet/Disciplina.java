package br.edu.infnet;

public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private int numeroCreditos;
    private String descricao;

    public Disciplina(String codigo, String nome, int cargaHoraria, int numeroCreditos, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.numeroCreditos = numeroCreditos;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Carga Horária: " + cargaHoraria + " horas, Número de Créditos: " + numeroCreditos + ", Descrição: " + descricao;
    }
}
