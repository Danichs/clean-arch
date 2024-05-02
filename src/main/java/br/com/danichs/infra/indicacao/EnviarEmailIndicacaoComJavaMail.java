package br.com.danichs.infra.indicacao;

import br.com.danichs.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.danichs.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao{

    @Override
    public void enviarPara(Aluno indicado) {
        // logica de envio de emails com a lib Java Mail
    }

}
