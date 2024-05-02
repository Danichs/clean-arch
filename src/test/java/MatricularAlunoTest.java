
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.danichs.aplicacao.aluno.matricular.MatricularAluno;
import br.com.danichs.infra.aluno.RepositorioDeAlunosEmMemoria;
// implementação de testes automatizados para testar a matricula dos alunos e seu useCase
public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        //MOCK -> Mockito
        MatricularAluno repositorio = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        // MatricularAluno useCase = new MatricularAluno(repositorio);
    }

}
