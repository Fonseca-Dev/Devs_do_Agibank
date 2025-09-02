import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1) Dada uma lista de valores (tipos double) em uma única classe,
        //calcule a soma de todos os valores que excedem R$ 5.000,00.
        List<Double> valores = List.of(1000d,6000d,3000d,2000d,8000d);
        double soma = valores.stream().filter(v -> v>5000.0).reduce(0.0, Double::sum);
        System.out.println("Soma: "+soma);

        //2) Dada uma lista de valores de depósito (tipo double), determine o maior valor absoluto.
        List<Double> depositos = List.of(1000d, 6000d, 9000d, 2000d, 8000d);
        double maior = depositos.stream().mapToDouble(Math::abs).max().orElse(0.0);
        System.out.println("Maior: " + maior);

        //3) Com uma lista de saldos (tipo double), filtre e liste aqueles valores que são negativos.
        List<Double> saldos = List.of(3d, -2d, 5d, -1d, -10d, 9d);
        List<Double> saldosNegativos = saldos.stream().filter(v -> v < 0).toList();
        System.out.println("Saldos negativos: " + saldosNegativos);

        //4) Calcule a média de todos os saldos fornecidos.
        //Se a lista estiver vazia, o resultado deve ser 0
        List<Double> saldos1 = List.of(1d, 2d, 3d, 4d, 5d);
        double mediaSaldo = saldos1.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println("Média dos Saldos: " + mediaSaldo);

        //5) Reordenar os valores fornecidos (tipo double) da lista em ordem decrescente.
        List<Double> valores1 = List.of(1000d,6000d,3000d,2000d,8000d);
        List<Double> valoresOrdemDecrescente = valores1.stream().sorted(Comparator.comparing(Double::doubleValue).reversed()).toList();
        System.out.println(valoresOrdemDecrescente);

        //6) Conte quantos valores em uma lista são maiores que R$ 1.000,00.
        List<Double> valores2 = List.of(1001d,1000d,500d,5000d,100d,5d,10000d);
        long qtde_valores_maiores = valores2.stream().filter(v -> v>1000d).count();
        System.out.println("Quantidade de valores maiores que R$ 1000,00: " + qtde_valores_maiores);

        //7) Verifique se algum valor na lista é maior que R$ 100.000,00
        List<Double> valores3 = List.of(1d,1000d,2000d,4d,5d,5000d);
        if(valores3.stream().anyMatch(v -> v>100000d)){
            System.out.println("Há valor maior que R$ 100.000,00");
            return;
        }
        System.out.println("Não há valor maior que R$ 100.000,00");

        //8) Crie uma string única com todos os valores positivos da lista, separados por vírgula.
        List<Integer> valores4 = List.of(1, 3, -3, -5, -8, 9, 1, 8);
        String valoresPositivos = valores4.stream().filter(v -> v > 0).map(String::valueOf).collect(Collectors.joining(","));
        System.out.println("Valores positivos: " + valoresPositivos);

        //9) Calcule a soma exclusiva dos valores positivos na lista.
        List<Integer> valores5 = List.of(1, 3, -3, -5, -8, 9, 1, 8);
        int somaInteiros = valores5.stream().filter(v -> v > 0).reduce(0, Integer::sum);
        System.out.println("Soma exclusiva dos positivos = " + somaInteiros);

        //10) Com uma lista de taxas (tipo double),
        //calcule o produto acumulado de todas — ou seja, multiplique todos os valores.
        List<Double> taxas = List.of(1.5, 2.0, 0.5);
        double produto = taxas.stream().reduce(1.0, (a, b) -> a * b);
        System.out.println("Produto acumulado = " + produto);
    }
}
