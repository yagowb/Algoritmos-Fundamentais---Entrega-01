import java.util.Scanner;

public class NumeroPrimo {

  Scanner prompt = new Scanner(System.in);
  int num, cont = 0, i = 1;

    public void verificaprimo(){
      System.out.println("Digite um número e verifique se o mesmo é primo: ");
      int num = prompt.nextInt();

      for(int i = 1; i <= num; i++){
        if(num%i == 0){
          cont++;
        }
      }
      if(cont == 2){
          System.out.println("O número é primo");
        }else{
          System.out.println("O número não é primo");
      }
    }
}
