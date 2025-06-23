public class ObterTaxas {
    public static double obterTaxa(String moeda, FiltroMoedas taxas) {
        return switch (moeda) {
            case "USD" -> 1.0;
            case "ARS" -> taxas.ARS();
            case "BOB" -> taxas.BOB();
            case "BRL" -> taxas.BRL();
            case "CLP" -> taxas.CLP();
            case "COP" -> taxas.COP();
            default -> 1.0;
        };
    }
}
