package oo;

public class CursoTeste {
    public static void main(String[] args) {


    Aluno aluno1 = new Aluno("José");
    Aluno aluno2 = new Aluno("Isabelly");
    Aluno aluno3 = new Aluno("Vitor");

    Curso curso1 = new Curso("Java completo");
    Curso curso2 = new Curso("Lingua portuguesa");
    Curso curso3 = new Curso("História");

    curso1.adicionarAluno(aluno1);
    curso1.adicionarAluno(aluno2);

    curso2.adicionarAluno(aluno2);
    curso2.adicionarAluno(aluno3);

    aluno3.adicionarCurso(curso3);
    aluno2.adicionarCurso(curso3);
    aluno1.adicionarCurso(curso3);

    for (Aluno aluno: curso3.alunos){
        System.out.println("Estrou matriculado no curso " +curso3.nome + "...");
        System.out.println("...e o meu nome é " + aluno.nome);
        System.out.println();
    }

        System.out.println(aluno1.cursos.get(0).alunos);

}
}
