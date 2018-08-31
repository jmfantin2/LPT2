public class MinhaThread extends Thread {
    private String nome;
    private Variavel var;
    private int valor_somar;
    
   public MinhaThread(String n, Variavel v, int s) {
       nome = n;  var = v; valor_somar = s;
   } 
 
   // metodo executado quando for chamado o metodo start da classe Thread
   public void run () {
       System.out.println("Thread "+nome+" executou.");
       
       // soma 1000000 de vezes o valor_somar na variavel compartilhada var.
       for (int i=0; i<1000000; i++) var.soma(valor_somar);
       
   }
 }

