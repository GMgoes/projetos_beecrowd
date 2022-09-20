import java.util.Locale;
import java.util.Scanner;

public class AreaFiguras {

        public static void main(String[] args) {

            final var local = new Locale("en","US");
            Scanner entrada = new Scanner(System.in);

            double  A = 0, B = 0, C = 0;

            A = entrada.useLocale(local).nextDouble();
            B = entrada.useLocale(local).nextDouble();
            C = entrada.useLocale(local).nextDouble();

            String resultado = String.format("%.3f",(A*C)/2.0);
            System.out.println("TRIANGULO: " + resultado.replace(',', '.'));

            resultado = String.format("%.3f",(3.14159*Math.pow(C,2)));
            System.out.println("CIRCULO: " +resultado.replace(',', '.'));

            resultado = String.format("%.3f",(((A+B)*C)/2.0));
            System.out.println("TRAPEZIO: "+resultado.replace(',', '.'));

            resultado = String.format("%.3f",((Math.pow(B,2.0))));
            System.out.println("QUADRADO: "+resultado.replace(',', '.'));

            resultado = String.format("%.3f",(A*B));
            System.out.println("RETANGULO: "+resultado.replace(',', '.'));


        }
}
