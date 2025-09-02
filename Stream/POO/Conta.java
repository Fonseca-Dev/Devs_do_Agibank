import java.util.Objects;

public class Conta {
    private String titular;
    private double saldo;
    private int agencia;
    private String tipo; // "corrente" ou "poupanca"

    public Conta(String titular, double saldo, int agencia, String tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Conta conta)) return false;
        return agencia == conta.agencia && Objects.equals(titular, conta.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular, agencia);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
