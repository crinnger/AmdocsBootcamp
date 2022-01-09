package br.com.crinnger.AmdocsBootcamp.domain;

import br.com.crinnger.AmdocsBootcamp.domain.enums.TipoCliente;

public class ClientePF extends Cliente{

    public ClientePF(String nome,String cpf){
        this.nome=nome;
        this.numeroIdentificacao=cpf;
        this.tipoCliente= TipoCliente.PF;
    }
}
