public class ConversorPadrao implements ConversorMoeda {
    private double taxaOrigem;
    private double taxaDestino;

    public ConversorPadrao(double taxaOrigem, double taxaDestino) {
        this.taxaOrigem = taxaOrigem;
        this.taxaDestino = taxaDestino;
    }

    @Override
    public double converter(double valor) {
        return (valor / taxaOrigem) * taxaDestino;
    }
}
