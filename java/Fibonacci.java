
import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    int termos, a = 0, b = 1, i = 2;

    System.out.println("Digite o nº de termos: ");
    termos = prompt.nextInt();

    while(i < termos){
      System.out.println(a + ", " + b + ", ");
      a+=b;
      b+=a;
      i+=2;
    }
    if(i == termos){
      System.out.println(a + ", " + b);
    }else{
      System.out.println(a);
    }
  }
}