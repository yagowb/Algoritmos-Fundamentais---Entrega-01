import java.util.Scanner;

public class Contagem {
    

  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    int N, cont = 0;
  
  
      System.out.println("Digite o valor de N: ");
      N = prompt.nextInt();

      int[] numero = new int[N];

     for(int i = 0; i < numero.length; i++){
        
        System.out.println("Digite o elemento [" + i + "]");
        numero[i] = prompt.nextInt();
     }
  
        if(numero[0] > N){
          for(int j = numero[0]; N <= j; j--){
              if(j > 0){
                  cont++;
              }
          }
        }

        if(numero[0] < N){
            for(int j = numero[0]; j <= N; j++){
                if(j > 0){
                  cont++;
                    }
                }
            }

      cont = cont - 1;
      System.out.printf("Número de valores inteiros entre %d e %d é igual a: %d", numero[0], N, cont);
    
  }
    
}
