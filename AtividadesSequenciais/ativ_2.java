package AtividadesSequenciais;
import java.util.Scanner;

public class ativ_2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] numeros = new int[3];
      int maior, menor, restoY, restoZ;

      System.out.println("Digite 3 números inteiros:");
      for (int i=0; i < 3; i++) {
        numeros[i] = input.nextInt();
      }

        if(numeros[0] > numeros[1] && numeros[0] > numeros[2]) {
            maior = numeros[0];
            System.out.println("O maior dentre os três números é: " + maior);
        } else if (numeros[1] > numeros[0] && numeros[1] > numeros[2]) {
            maior = numeros[1];
            System.out.println("O maior dentre os três números é: " + maior);
        } else {
            maior = numeros[2];
            System.out.println("O maior dentre os três números é: " + maior);
        }

        if(numeros[0] < numeros[1] && numeros[0] < numeros[2]) {
            menor = numeros[0];
            System.out.println("O menor dentre os três números é: " + menor);
        } else if (numeros[1] < numeros[0] && numeros[1] < numeros[2]) {
            menor = numeros[1];
            System.out.println("O menor dentre os três números é: " + menor);
        } else {
            menor = numeros[2];
            System.out.println("O menor dentre os três números é: " + menor);
        }

        if(numeros[0]>numeros[1] && numeros[0]<numeros[2] || numeros[0]<numeros[1] && numeros[0]>numeros[2] ){
          intervalo=numeros[0];
          System.out.println("O primeiro numero está no intervalo entre o segundo e terceiro numero.");
        } else {
          System.out.println("O primeiro numero não está no intervalo entre o segundo e terceiro numero.");
        }
         
        restoY = numeros[0] % numeros[1];
        restoZ = numeros[0] % numeros[2];
        if(restoY == 0) {
            System.out.println("O primeiro numero é divisivel pelo segundo.");
        } else {
            System.out.println("O primeiro numero não é divisivel pelo segundo.");
        }

        if(restoZ == 0){
            System.out.println("O primeiro numero é divisivel pelo terceiro.");
        } else {
            System.out.println("O primeiro numero não é divisivel pelo terceiro.");
        }

      input.close();
    }
}