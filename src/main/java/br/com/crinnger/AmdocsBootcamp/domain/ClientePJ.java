package br.com.crinnger.AmdocsBootcamp.domain;

import br.com.crinnger.AmdocsBootcamp.domain.enums.TipoCliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ClientePJ extends Cliente{
    private String razaoSocial;
    public ClientePJ(String nomeFantasia,String razaoSocial,String cnpj){
        this.nome=nomeFantasia;
        this.razaoSocial=razaoSocial;
        this.numeroIdentificacao=cnpj;
        this.tipoCliente= TipoCliente.PJ;
    }
}
