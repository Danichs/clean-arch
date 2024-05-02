package br.com.danichs.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.danichs.dominio.aluno.Aluno;
import br.com.danichs.dominio.aluno.AlunoNaoEncontrado;
import br.com.danichs.dominio.aluno.CPF;
import br.com.danichs.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCpf(CPF cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }

}