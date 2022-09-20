import java.util.Scanner;

public class Teste{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero = 0, horas_trabalhadas = 0;
        double valor_hora;

        numero = entrada.nextInt();
        horas_trabalhadas = entrada.nextInt();
        valor_hora = entrada.nextDouble();

        String resultado = String.format("%.2f",(valor_hora*horas_trabalhadas));

        System.out.println("NUMBER = "+numero);
        System.out.println("SALARY = U$ "+resultado.replace(',','.'));
    }
}
