package Exercicio2;

public class Conta {
    private double saldoSeguro;
    private double saldoCorrente;
    private double saldoPoupanca;

    public Conta() {
        this.saldoSeguro = 300;
        this.saldoCorrente = 2000;
        this.saldoPoupanca = 0;
    }

    public double getSaldoSeguro() {
        return saldoSeguro;
    }

    public double getSaldoCorrente() {
        return saldoCorrente;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }
    public double getSaldo() {
        return getSaldoCorrente()+getSaldoSeguro()+getSaldoPoupanca();
    }
    public double tributosContaSeguro() {
        return (42 * getSaldoSeguro())-getSaldo();
    }
    public double tributosContaCorrente() {
        return 0.01 * getSaldoCorrente();
    }
    public double tributosContaPoupanca() {
        return getSaldoPoupanca();
    }

    public void getSaldoConta() {
        System.out.println("Saldo atual da conta sem rendimento: "+getSaldo());
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Rendimento da Conta Corente: "+(tributosContaCorrente()));
        System.out.println("Rendimento do Seguro de vida: "+(tributosContaSeguro()));
        System.out.println("Rendimento da Poupança: "+(tributosContaPoupanca()));
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Saldo da conta com todos os rendimento: "+(tributosContaPoupanca()+tributosContaCorrente()+tributosContaSeguro()));

    }
}
