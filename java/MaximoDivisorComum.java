
import java.util.Scanner;

public class MaximoDivisorComum {

  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    int num1, num2, resto, result;



    System.out.println("Digite o primeiro número: ");
    num1 = prompt.nextInt();
    System.out.println("Digite o segundo número: ");
    num2 = prompt.nextInt();

      do{
        resto = num1%num2;
        num1 = num2;
        num2 = resto;
      }while(resto!=0);


    System.out.println("O máximo divisor comum é "+num1);
  }
}
    