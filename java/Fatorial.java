import java.util.Scanner;

public class Fatorial{
    Scanner prompt = new Scanner(System.in);

    int n, prod = 1, i = 0;

    public void Fatorial(){
        System.out.println("Digite o número: ");
        n = prompt.nextInt();

        while(i < n){
            i++;
            prod = prod * i;
        }
        System.out.println("O fatorial de " + n + " é igual a: " + prod);
    }
}