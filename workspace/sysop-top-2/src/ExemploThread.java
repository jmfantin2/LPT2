public class ExemploThread {
   public static void main(String[] args) {
       try {
           
          // variavel a ser compartilhada
          Variavel v = new Variavel();
     
          // cria uma thread e inicia sua execução
          MinhaThread t1 = new MinhaThread("t1",v,1);
          t1.start();
     
          // cria uma thread e inicia sua execução
          MinhaThread t2 = new MinhaThread("t2",v,2);
          t2.start();
       
          // espera as duas threads terminarem suas execuções
          t1.join();
          t2.join();
       
           // variavel deveria ter o valor 3.000.000
          System.out.println("Valor em Variavel = "+v.valor());
           
       } catch (InterruptedException e) { }
        
   }
 }
