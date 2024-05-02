package br.com.danichs;

import br.com.danichs.aplicacao.aluno.matricular.MatricularAluno;
import br.com.danichs.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.danichs.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(new MatricularAlunoDto(nome, cpf, email));

    }
}