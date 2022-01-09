package br.com.crinnger.AmdocsBootcamp.domain;

import br.com.crinnger.AmdocsBootcamp.domain.enums.TipoCliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.aop.target.PrototypeTargetSource;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Cliente {
    protected Long id;
    protected String nome;
    protected TipoCliente tipoCliente;
    protected String numeroIdentificacao;
}
