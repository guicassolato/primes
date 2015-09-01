import java.io.*;
import java.util.Date;

public class Buscador {
  
  public static Boolean ePrimo(int n) {
    Boolean primo = true;
    int r;
    for (int d = 2; d < n; d++) {
      if (n % d == 0) {
        primo = false;
        break;
      }
    }
    return primo;
  }
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
    
    System.out.println("Preencha o início do intervalo de varredura (mín. 2): ");
    int inicio = Integer.parseInt(br.readLine());
    if (inicio < 2) throw new Exception("ERRO: valor inválido!");

    System.out.println("Preencha o fim do intervalo de varredura: ");
    int fim = Integer.parseInt(br.readLine());
    if (fim < 2) throw new Exception("ERRO: valor inválido!");
    
    if (fim < inicio) throw new Exception("ERRO: o valor final não pode ser inferior ao valor incial do intervalo de varredura!");
    
    System.out.println("INÍCIO DA VARREDURA\n-----------------------------");
    
    Date d1 = new Date();
    
    for (int i = inicio; i <= fim; i++) {
      if (ePrimo(i)) {
        System.out.println("O número "+i+" é primo.");
      }
      Thread.sleep(1);
    }
    
    System.out.println("-----------------------------\nFIM DA VARREDURA");
    Date d2 = new Date();
    
    long dif = d2.getTime() - d1.getTime();
    System.out.println("Tempo decorrido: "+dif+" milisegundos.");
    
  }
  
}