import java.util.Scanner;

public class Fatorial{
   public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);

    int n, prod = 1, i = 0;

        System.out.println("Digite o número: ");
        n = prompt.nextInt();

            while(i < n){
                i = i + 1;
                prod = prod * i;
             }
        System.out.println("O fatorial de " + n + " é igual a: " + prod);
    }
   }
