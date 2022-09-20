import java.util.Scanner;

public class CalculaVolumeEsfera {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double raio = 0, volume = 0;

        raio = entrada.nextDouble();

        volume = ((4.0/3)*(3.14159)*(Math.pow(raio,3)));

        String resultado = String.format("%.3f",volume);

        System.out.println("VOLUME = "+resultado.replace(',','.'));
    }
}