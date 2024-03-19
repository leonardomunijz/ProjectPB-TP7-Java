package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosInscritos;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunosInscritos = new ArrayList<>();
    }

    public String addAluno(Aluno aluno, Turma turmaNome) {
        if (alunosInscritos.size() >= 50) {
            return "Turma cheia";
        } else {
            alunosInscritos.add(aluno);
            return "Aluno " + aluno.getNome() + " adicionado à turma " + turmaNome;
        }
    }

    public boolean abrirTurma() {
        // A turma só pode ser aberta se houver pelo menos um aluno matriculado
        return alunosInscritos.size() >= 1;
    }

    public String gerarPauta() {
        // Construindo a string com as informações da turma
        StringBuilder pauta = new StringBuilder("Código da Turma: " + codigo + "\n");
        pauta.append("Disciplina: ").append(disciplina.getNome()).append("\n");
        pauta.append("Professor: ").append(professor.getNome()).append("\n");
        pauta.append("Alunos inscritos:\n");
        for (Aluno aluno : alunosInscritos) {
            pauta.append("- ").append(aluno.getNome()).append("\n");
        }
        return pauta.toString();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return codigo;
    }
}
