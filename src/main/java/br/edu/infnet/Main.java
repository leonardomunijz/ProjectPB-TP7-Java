package br.edu.infnet;

public class Main {
    public static void main(String[] args) {
        // Criando professores, disciplinas e alunos com dados fictícios
        Professor professor1 = new Professor("João da Silva", 1001, "Rua das Flores, 123", "(11) 1234-5678", "Doutorado em Matemática", "Efetivo", "Possui mais de 10 anos de experiência no ensino superior");
        Disciplina disciplina1 = new Disciplina("MAT101", "Cálculo I", 60, 4, "Estudo dos fundamentos do cálculo diferencial e integral");
        Aluno aluno1 = new Aluno("Ana", 2001);
        Aluno aluno2 = new Aluno("Pedro", 2002);
        Aluno aluno3 = new Aluno("Mariana", 2003);

        // Criando uma turma
        Turma turma1 = new Turma("T001", disciplina1, professor1);

        // Adicionando alunos à turma
        System.out.println(turma1.addAluno(aluno1, turma1)); // Aluno adicionado
        System.out.println(turma1.addAluno(aluno2, turma1)); // Aluno adicionado
        System.out.println(turma1.addAluno(aluno3, turma1)); // Aluno adicionado

        // Verificando se a turma foi aberta
        if (turma1.abrirTurma()) {
            System.out.println("\nTurma "+ turma1.getCodigo() +" aberta com sucesso!");
        } else {
            System.out.println("\nNão foi possível abrir a turma.");
        }

        // Gerando a pauta da turma
        System.out.println("\nPauta da Turma:");
        System.out.println(turma1.gerarPauta());

        // Agora, vamos criar mais duas turmas, disciplinas, professores e alunos
        Professor professor2 = new Professor("Maria Pereira", 1002, "Avenida Paulista, 456", "(11) 2345-6789", "Doutorado em Física", "Efetivo", "Especialista em física quântica");
        Disciplina disciplina2 = new Disciplina("FIS201", "Física Quântica", 60, 4, "Estudo dos princípios da física quântica");
        Aluno aluno4 = new Aluno("Carlos", 2004);
        Aluno aluno5 = new Aluno("Julia", 2005);

        Turma turma2 = new Turma("T002", disciplina2, professor2);
        System.out.println(turma2.addAluno(aluno4, turma2)); // Aluno adicionado
        System.out.println(turma2.addAluno(aluno5, turma2)); // Aluno adicionado

        if (turma2.abrirTurma()) {
            System.out.println("\nTurma "+ turma2.getCodigo() +" aberta com sucesso!");
        } else {
            System.out.println("\nNão foi possível abrir a turma.");
        }

        System.out.println("\nPauta da Turma:");
        System.out.println(turma2.gerarPauta());

        Professor professor3 = new Professor("Lucas Ferreira", 1003, "Avenida Brasil, 789", "(11) 3456-7890", "Doutorado em Ciência da Computação", "Efetivo", "Especialista em Inteligência Artificial");
        Disciplina disciplina3 = new Disciplina("CSC301", "Inteligência Artificial", 60, 4, "Estudo dos princípios e técnicas de Inteligência Artificial");

        Aluno aluno6 = new Aluno("Lucas", 2006);
        Aluno aluno7 = new Aluno("Fernanda", 2007);

        Turma turma3 = new Turma("T003", disciplina3, professor3);
        System.out.println(turma3.addAluno(aluno6, turma3)); // Aluno adicionado
        System.out.println(turma3.addAluno(aluno7, turma3)); // Aluno adicionado

        if (turma3.abrirTurma()) {
            System.out.println("\nTurma "+ turma3.getCodigo() +" aberta com sucesso!");
        } else {
            System.out.println("\nNão foi possível abrir a turma.");
        }

        System.out.println("\nPauta da Turma:");
        System.out.println(turma3.gerarPauta());
    }
}
