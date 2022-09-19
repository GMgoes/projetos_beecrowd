import java.util.Scanner;

public class Teste{
    public static void main(String[] args) throws Exception {
        int cont = 0;
        Scanner lerDados = new Scanner(System.in);
        System.out.println("digite um valor para 'N' :");
        int n = lerDados.nextInt();

        int i;
        for(i = 0; i < n; ++i) {
            System.out.print("" + i + " , ");
        }

        System.out.println("\n");

        for(i = 1; i < n; ++i) {
            cont += i;
        }

        System.out.print("soma : " + cont);
    }
}
