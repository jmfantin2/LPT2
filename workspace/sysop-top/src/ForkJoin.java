public class ForkJoin {
   public static void main(String[] args) {
       try {
          System.out.println("S1 ");

          // cria uma thread e inicia sua execução
          T t1 = new T("S2 ");
          t1.start();

          Thread.currentThread().sleep(2);

          // cria uma thread e inicia sua execução
          T t2 = new T("S3 ");
          t2.start();
       
          System.out.println ("S4 ");

          // espera as duas threads terminarem suas execuções
          t1.join();
          t2.join();
       
          System.out.println("S5");
           
       } catch (InterruptedException e) { }
   }
 }
