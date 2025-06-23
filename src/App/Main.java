import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ConsultaAPI consultaAPI = new ConsultaAPI();

        boolean continuar = true;

        while (continuar) {

            String menu = """
                    ====== CONVERSOR DE MOEDAS =====
                    Escolha uma opção:
                    1) Dólar => Peso argentino
                    2) Peso argentino => Dólar
                    3) Dólar => Real Brasileiro
                    4) Real Brasileiro => Dólar
                    5) Dólar => Peso Colombiano
                    6) Peso Colombiano => Dólar
                    7) Sair
                    """;
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();

            if (opcao == 7) {
                System.out.println("Obrigado por usar o conversor. Até mais!");
                continuar = false;
            }

            System.out.print("Digite o valor que deseja converter: ");
            double valor = input.nextDouble();

            String baseMoeda = switch (opcao) {
                case 1, 3, 5 -> "USD";
                case 2 -> "ARS";
                case 4 -> "BRL";
                case 6 -> "COP";
                default -> null;
            };

            String moedaDestino = switch (opcao) {
                case 1 -> "ARS";
                case 2 -> "USD";
                case 3 -> "BRL";
                case 4 -> "USD";
                case 5 -> "COP";
                case 6 -> "USD";
                default -> null;
            };

            if (baseMoeda == null || moedaDestino == null) {
                System.out.println("Opção inválida.");
                continue;
            }

            FiltroMoedas taxas = consultaAPI.buscarTaxas("USD");
            if (taxas == null) {
                System.out.println("Erro ao obter as taxas.");
                continue;
            }

            double taxaBase = ObterTaxas.obterTaxa(baseMoeda, taxas);
            double taxaDestino = ObterTaxas.obterTaxa(moedaDestino, taxas);

            ConversorMoeda conversor = new ConversorPadrao(taxaBase, taxaDestino);
            double convertido = conversor.converter(valor);

            System.out.printf("Valor convertido de %s para %s: %.2f%n",
                    baseMoeda, moedaDestino, convertido);
        }
    }

}
