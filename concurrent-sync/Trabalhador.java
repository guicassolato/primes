public class Trabalhador extends Thread {
  
  private int inicio, fim;
  
  private Boolean ePrimo(int n) {
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
  
  public Trabalhador(int i, int f) {
    this.inicio = i;
    this.fim = f;
  }
  
  public void run() {
    for (int i = inicio; i <= fim; i++) {
      if (ePrimo(i)) {
        System.out.println("[T"+getId()+"] O número "+i+" é primo.");
      }
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        System.err.println("ERRO: " + e.getMessage());
      }
    }
  }
  
}