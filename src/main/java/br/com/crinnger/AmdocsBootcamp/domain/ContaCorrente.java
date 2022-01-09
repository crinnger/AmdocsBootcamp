package br.com.crinnger.AmdocsBootcamp.domain;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("=== Extrato conta corrente ==");
        super.imprimir();
    }
}
