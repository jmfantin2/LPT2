/* Classe simples que tem um valor interno inicializado com zero. Neste valor podem ser somados valores atrav�s do m�todo soma, e buscar o valor que est� armazenado internamente via m�todo valor.
 
 Autor: Avelino Zorzo
 Data: 16.09.2014
 */

public class Variavel extends Object {
    private int val = 0;
   
    synchronized public void soma (int v) {
        val += v;
    }
    
    public int valor() {
        return val;
    }
 }

/* Exemplo de thread. Este c�digo de thread simplesmente recebe um nome, uma variavel compartilhada e um valor a somar nesta variavel compartilhada.
 
 Autor: Avelino Zorzo
 Data: 16.09.2014
 */

