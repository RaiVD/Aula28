package Exercicio2;

public class ContaCorrente extends Conta implements Tributaveis{
    @Override
    public double tributosContaSeguro() {
        return 0;
    }

    @Override
    public double tributosContaCorrente() {
        return 0;
    }

    @Override
    public double tributosContaPoupanca() {
        return 0;
    }
}
