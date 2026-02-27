package AtividadesSequenciais;

import java.util.Scanner;

public class ativ_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorInteiro, fatorial;

        System.out.println("Insira um valor inteiro para calcular seu fatorial: ");
        valorInteiro = input.nextInt();
        fatorial = valorInteiro;

        for( int x = valorInteiro; x>1; x-- ) {

            valorInteiro = valorInteiro -1;
            fatorial = fatorial * valorInteiro;
        }

        System.out.println("Resultado: " + fatorial);

      input.close();
    }
}
