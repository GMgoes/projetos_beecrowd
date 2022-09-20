import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double salario_fixo = 0,total_vendas = 0;
        String nome;

        nome = entrada.next();
        salario_fixo = entrada.nextDouble();
        total_vendas = entrada.nextDouble();

        String resultado = String.format("%.2f",(salario_fixo+(total_vendas*0.15)));

        System.out.println("TOTAL = R$ "+resultado.replace(',','.'));
    }
}
