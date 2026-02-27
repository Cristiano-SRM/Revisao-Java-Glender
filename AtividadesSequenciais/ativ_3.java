package AtividadesSequenciais;
import java.util.Scanner;

public class ativ_3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] numeros = new int[12];
      int maior, menor, posMaior=0, posMenor=0;

      System.out.println("Informe a temperatura média dos 12 meses: ");
      for (int i=0; i < 12; i++) {
        numeros[i] = input.nextInt();
      }
        menor = maior = numeros[0];
        for (int i = 1; i < 12; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
        }
        posMaior = posMaior + 1;
        posMenor = posMenor + 1;

        String mesMaior = "", mesMenor = "";

        switch (posMaior) {
            case 1:
                mesMaior = "Janeiro";
                break;
            case 2:
                mesMaior = "Fevereiro";
                break;
            case 3:
                mesMaior = "Março";
                break;
            case 4:
                mesMaior = "Abril";
                break;
            case 5:
                mesMaior = "Maio";
                break;
            case 6:
                mesMaior = "Junho";
                break;
            case 7:
                mesMaior = "Julho";
                break;
            case 8:
                mesMaior = "Agosto";
                break;
            case 9:
                mesMaior = "Setembro";
                break;
            case 10:
                mesMaior = "Outubro";
                break;
            case 11:
                mesMaior = "Novembro";
                break;
            case 12:
                mesMaior = "Dezembro";
                break;
        }
        switch (posMenor) {
            case 1:
                mesMenor = "Janeiro";
                break;
            case 2:
                mesMenor = "Fevereiro";
                break;
            case 3:
                mesMenor = "Março";
                break;
            case 4:
                mesMenor = "Abril";
                break;
            case 5:
                mesMenor = "Maio";
                break;
            case 6:
                mesMenor = "Junho";
                break;
            case 7:
                mesMenor = "Julho";
                break;
            case 8:
                mesMenor = "Agosto";
                break;
            case 9:
                mesMenor = "Setembro";
                break;
            case 10:
                mesMenor = "Outubro";
                break;
            case 11:
                mesMenor = "Novembro";
                break;
            case 12:
                mesMenor = "Dezembro";
                break;
        }

        System.out.println("Maior temperatura: " + maior + " graus no mês de " + mesMaior);
        System.out.println("Menor temperatura: " + menor + " graus no mês de " + mesMenor);

    input.close();
    }
}