package br.com.danichs;

import java.util.ArrayList;
import java.util.List;

// Tipo de classe chamado de entidade, possui um identificador que diferencia cada objeto.
public class Aluno {

    private CPF cpf;
    private String nome;
    
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

}