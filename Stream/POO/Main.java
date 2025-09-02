import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Conta c1 = new Conta("Joao", 999, 1, "Corrente");
        Conta c2 = new Conta("Carlos", 150, 1, "Corrente");
        Conta c3 = new Conta("Maria", 1001, 1, "Poupança");
        Conta c4 = new Conta("Joana", 1100, 1, "Corrente");
        Conta c5 = new Conta("Maria", 800, 1, "Poupança");
        Collections.addAll(contas, c1, c2, c3, c4, c5);

        //Exercício 1 – Filtrar contas com saldo maior que 1000
        contas.stream().filter(c -> c.getSaldo() > 1000).forEach(System.out::println);

        //Exercício 2 – Listar nomes dos titulares das contas
        contas.stream().map(Conta::getTitular).forEach(System.out::println);

        //Exercício 3 – Somar todos os saldos das contas
        double totalSaldos = contas.stream().map(Conta::getSaldo).reduce(Double::sum).orElse(0.0);
        System.out.println("Soma total dos saldos = R$ " + totalSaldos);

        //Exercício 4 – Contar contas do tipo “corrente”
        long qtdeContasCorrente = contas.stream().filter(c -> c.getTipo().equalsIgnoreCase("Corrente")).count();
        System.out.println("Quantidade de contas correntes: " + qtdeContasCorrente);

        //Exercício 5 – Listar contas com saldo entre 500 e 2000
        System.out.println("Contas com saldo entre 500 e 2000");
        contas.stream().filter(c -> c.getSaldo() >= 500 && c.getSaldo() <= 2000).forEach(System.out::println);

        //Exercício 6 – Ordenar contas por saldo crescente
        System.out.println("Contas por saldo crescente:");
        contas.stream().sorted(Comparator.comparing(Conta::getSaldo)).forEach(System.out::println);

        //Exercício 7 – Ordenar contas por saldo decrescente
        System.out.println("Contas por saldo decrescente:");
        contas.stream().sorted(Comparator.comparing(Conta::getSaldo).reversed()).forEach(System.out::println);

        //Exercício 8 – Remover contas duplicadas (mesmo titular e agência)
        System.out.println("Contas sem duplicada:");
        contas.stream().distinct().forEach(System.out::println);

        //Exercício 9 – Criar lista de titulares em maiúsculas
        System.out.println("Cliente em letra maiuscula");
        contas.stream().map(c -> c.getTitular().toUpperCase()).forEach(System.out::println);

        //Exercício 10 – Filtrar contas correntes e somar os saldos
        double somaSaldoContasCorrentes = contas.stream().filter(c -> c.getTipo().equalsIgnoreCase("corrente")).map(Conta::getSaldo).reduce(0.0, Double::sum);
        System.out.println("Soma total saldo das Contas Correntes = R$ " + somaSaldoContasCorrentes);

    }
}
