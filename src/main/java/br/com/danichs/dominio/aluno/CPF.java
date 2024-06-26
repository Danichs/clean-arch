package br.com.danichs.dominio.aluno;

//Value object, não possui um identificador para diferenciação de cada objeto, se há mesmo endereço por exemplo, significa ser o mesmo endereço.
public class CPF {
    
    private String numero;

    public CPF(String numero) {
        if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
