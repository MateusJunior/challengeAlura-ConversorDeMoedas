import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.ConsultaMoeda;
import model.Currency;

import java.util.Map;
import java.util.Scanner;

//6aa00ef5286be619f056f771
//https://v6.exchangerate-api.com/v6/6aa00ef5286be619f056f771/latest/USD
public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Scanner leituraString = new Scanner(System.in);
        Double valorConverter, valorConvertido = 0.0;
        String siglaMoedaAtual, siglaMoedaConvertida;
        int opc = 0;

        Gson gson = new GsonBuilder()
               // .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();

        do{
            System.out.println("************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println("0) Escolher conversão de moedas");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso colombiano =>> Real Brasileiro");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida: ");
            opc = leitura.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("0) Escolher conversão de moedas");
                    System.out.println("Digite a sigla da moeda que atual: ");
                    siglaMoedaAtual = leituraString.nextLine();
                    System.out.println("Digite a sigla da moeda para qual deseja converter: ");
                    siglaMoedaConvertida = leituraString.nextLine();
                    System.out.println("Digite o valor a ser convertido de " + siglaMoedaAtual +" para " + siglaMoedaConvertida);
                    valorConverter = leitura.nextDouble();

                    Currency newCurrency = consultaMoeda.buscaMoeda(siglaMoedaAtual);
                    Map<String, Double> conversionRates = newCurrency.conversion_rates();
                    for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        if (key.equals(siglaMoedaConvertida)){
                            valorConvertido = valorConverter * value;
                        }
                       // System.out.println("Key: " + key + ", Value: " + value);
                    }

                    System.out.println("O valor " + siglaMoedaAtual + valorConverter +" são " + siglaMoedaConvertida + valorConvertido);

                    break;
                case 1:
                    System.out.println("1) Dólar =>> Peso argentino");
                    System.out.println("Digite o valor a ser convertido de Dolar para Peso Argentino: ");
                    valorConverter = leitura.nextDouble();

                    newCurrency = consultaMoeda.buscaMoeda("USD");
                    conversionRates = newCurrency.conversion_rates();
                    for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        if (key.equals("ARS")){
                            valorConvertido = valorConverter * value;
                        }
                       // System.out.println("Key: " + key + ", Value: " + value);
                    }

                    System.out.println("O valor Dólar: "+valorConverter+" são" + valorConvertido + " Pesos Argentinos");
                    break;

                case 2:
                    System.out.println("2) Peso argentino =>> Dólar");
                    System.out.println("Digite o valor a ser convertido de Peso Argentino para Dólar: ");
                    valorConverter = leitura.nextDouble();

                    newCurrency = consultaMoeda.buscaMoeda("ARS");
                    conversionRates = newCurrency.conversion_rates();
                    for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        if (key.equals("USD")){
                            valorConvertido = valorConverter * value;
                        }
                      //  System.out.println("Key: " + key + ", Value: " + value);
                    }
                    System.out.println("O valor Pesos Argentinos: " + valorConverter + " são" + valorConvertido + " Dólares");
                    break;

                case 3:
                    System.out.println("3) Dólar =>> Real Brasileiro");
                    System.out.println("Digite o valor a ser convertido de Dolar para Real Brasileiro: ");
                    valorConverter = leitura.nextDouble();

                    newCurrency = consultaMoeda.buscaMoeda("USD");
                    conversionRates = newCurrency.conversion_rates();
                    for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        if (key.equals("BRL")){
                            valorConvertido = valorConverter * value;
                        }
                       // System.out.println("Key: " + key + ", Value: " + value);
                    }
                    System.out.println("O valor de Dólares "+ valorConverter+" são" + valorConvertido + " Reais");
                    break;

                case 4:
                    System.out.println("4) Real Brasileiro =>> Dólar");

                    System.out.println("Digite o valor a ser convertido de Real Brasileiro para Dolar: ");
                    valorConverter = leitura.nextDouble();

                    newCurrency = consultaMoeda.buscaMoeda("BRL");
                    conversionRates = newCurrency.conversion_rates();
                    for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        if (key.equals("USD")){
                            valorConvertido = valorConverter * value;
                        }
                      //  System.out.println("Key: " + key + ", Value: " + value);
                    }
                    System.out.println("O valor de Real Brasileiro "+ valorConverter+" são" + valorConvertido + " Dólares");
                    break;


                case 5:
                    System.out.println("5) Dólar =>> Peso Colombiano");
                    System.out.println("Digite o valor a ser convertido de Dolar para Peso Colombiano: ");
                    valorConverter = leitura.nextDouble();

                    newCurrency = consultaMoeda.buscaMoeda("USD");
                    conversionRates = newCurrency.conversion_rates();
                    for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        if (key.equals("COP")){
                            valorConvertido = valorConverter * value;
                        }
                      //  System.out.println("Key: " + key + ", Value: " + value);
                    }
                    System.out.println("O valor de "+ valorConverter+" Dólares são" + valorConvertido + " Pesos Colombianos");
                    break;

                case 6:
                    System.out.println("6) Peso colombiano =>> Real");
                    System.out.println("Digite o valor a ser convertido de Peso Colombiano para Real: ");
                    valorConverter = leitura.nextDouble();

                    newCurrency = consultaMoeda.buscaMoeda("COP");
                    conversionRates = newCurrency.conversion_rates();
                    for (Map.Entry<String, Double> entry : conversionRates.entrySet()) {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        if (key.equals("BRL")){
                            valorConvertido = valorConverter * value;
                        }
                      //  System.out.println("Key: " + key + ", Value: " + value);
                    }
                    System.out.println("O valor de "+ valorConverter+" Pesos Colombianos são" + valorConvertido + " Reais");
                    break;

                case 7:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("************************************************");
        }while(opc != 7);
        leitura.close();
    }
}
