/*
 Exemplo de thread. Este c�digo de thread simplesmente recebe um nome e quando � ativada imprime este nome na tela.
 
 Autor: Avelino Zorzo
 Data: 16.09.2014
 */
public class T extends Thread {
 
   private String nome;
    
   public T(String n) {
       nome = n;
    } 
 
   // metodo executado quando o metodo start da classe Thread for chamado
   public void run () {
        try {
          Thread.currentThread().sleep(2);
          System.out.println(nome+" ");
        } catch (InterruptedException e) {}
   }
 }

/*
    Exemplo de programa que cria Thread e simula a execu��o de
    opera��es com o nome da thread.
 
    Monte o grafo de preced�ncia de opera��es impressas por este programa.
    Quem � concorrente/paralelo com quem?
    Qual a ordem que as mensagens foram impressas? 
    Remova os coment�rios antes dos comandos try catch e Thread.current...
    na classe T, e o coment�rio Thread.current ... no m�todo main. 
    Qual a ordem impressa agora? Por que? 
    Autor: Avelino Zorzo
    Data: 16.09.2014
*/

