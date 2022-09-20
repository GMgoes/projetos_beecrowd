import java.util.Scanner;

public class PrecoPorPeca {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int unidade = 0, codigo_peca = 0;
        double preco_por_unidade = 0, valor_total = 0;

        codigo_peca = entrada.nextInt();
        unidade = entrada.nextInt();
        preco_por_unidade = entrada.nextDouble();

        valor_total = valor_total + (preco_por_unidade*unidade);

        codigo_peca = entrada.nextInt();
        unidade = entrada.nextInt();
        preco_por_unidade = entrada.nextDouble();

        valor_total = valor_total + (preco_por_unidade*unidade);

        String resultado = String.format("%.2f",valor_total);

        System.out.println("VALOR A PAGAR: R$ "+resultado.replace(',','.'));
    }
}
