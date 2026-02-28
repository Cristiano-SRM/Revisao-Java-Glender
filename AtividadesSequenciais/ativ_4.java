import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ativ_4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
      System.out.println("Digite o tamanho do primeiro vetor:");
      int tamanhoVetX = input.nextInt();
      int[] vetorX = new int[tamanhoVetX];
      System.out.println("Digite os elementos do primeiro vetor:");
      for (int i=0; i < tamanhoVetX; i++) {
        vetorX[i] = input.nextInt();
      }


      System.out.println("Digite o tamanho do segundo vetor:");
      int tamanhoVetY = input.nextInt();
      int[] vetorY = new int[tamanhoVetY];
      System.out.println("Digite os elementos do segundo vetor:");
      for (int i=0; i < tamanhoVetY; i++) {
        vetorY[i] = input.nextInt();
      }


      List<Integer> vetUniaoZ = new ArrayList<>();
      for (int num:vetorX) {
        if (!vetUniaoZ.contains(num)) {
             vetUniaoZ.add(num);
}
      }
      for (int num:vetorY) {
        if (!vetUniaoZ.contains(num)) {
             vetUniaoZ.add(num);
}
      }

      System.out.println("A união dos dois vetores é: " + vetUniaoZ);

     input.close();
    }
}

