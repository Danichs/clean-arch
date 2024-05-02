package br.com.danichs.dominio.aluno;

//Value object, não possui um identificador para diferenciação de cada objeto, se há mesmo endereço por exemplo, significa ser o mesmo endereço.
public class Email {

    private String endereco;

    public Email(String endereco){
        if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail inválido!");            
        } 
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
