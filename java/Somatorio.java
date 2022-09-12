import java.util.Scanner;

public class Somatorio {
    
    Scanner prompt = new Scanner(System.in);
    int n, num, soma = 0, i = 0;

    public void somaTotal(){

        System.out.println("Digite a quantidade de números a serem somados: ");
        int n = prompt.nextInt();

        while(i < n){
            i++;

            System.out.println("Digite o "+ i + "º número");
            num = prompt.nextInt();
            soma = soma + num;
        }
        System.out.println("A soma dos números é igual a " + soma);
    }
}
