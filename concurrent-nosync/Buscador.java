import java.io.*;
import java.util.Date;

public class Buscador {
  
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
    
    int intervTotal = fim - inicio + 1;
    
    System.out.println("Preencha a quantidade de threads trabalhadoras (mín. 1, máx. "+intervTotal+"): ");
    int numThreads = Integer.parseInt(br.readLine());
    if (numThreads < 1) throw new Exception("ERRO: valor inválido!");
    if (numThreads > intervTotal) throw new Exception("ERRO: quantidade de threads não deve ser superior ao intervalo de varredura!");
    
    int intervThread = (int) Math.ceil(intervTotal / numThreads);
    int i, f;
    
    Trabalhador[] trab = new Trabalhador[numThreads];
    
    for (int n = 0; n < numThreads; n++) {
      i = inicio + (intervThread * n);
      f = i + intervThread - 1;
      f = Math.min(f, fim);
      trab[n] = new Trabalhador(i, f);
    }
    
    System.out.println("INÍCIO DA VARREDURA\n-----------------------------");
    
    Date d1 = new Date();
    
    for (int n = 0; n < numThreads; n++) trab[n].start();
    
    System.out.println("-----------------------------\nFIM DA VARREDURA");
    Date d2 = new Date();
    
    long dif = d2.getTime() - d1.getTime();
    System.out.println("Tempo decorrido: "+dif+" milisegundos.");
    
  }
  
}