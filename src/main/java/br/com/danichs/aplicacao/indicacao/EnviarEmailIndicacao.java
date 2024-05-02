package br.com.danichs.aplicacao.indicacao;

import br.com.danichs.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
    
}
