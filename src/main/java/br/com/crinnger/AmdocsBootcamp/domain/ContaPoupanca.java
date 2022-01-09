package br.com.crinnger.AmdocsBootcamp.domain;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("=== Extrato conta poupanca ==");
        super.imprimir();
    }
}
