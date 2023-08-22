package classes_metodos;
/*
  - Para fins de estudo e revisões 
 */

class Metodo{
	   
	  public void escrever() {
		   System.out.println("Metodo sem retorno");
	   }
	  
	  String nome = "Metodo com retorno"; 
	  public String recebe() {
		  
		  return nome;
	  }
    }

public class Exe01 {
   public static void main(String[] args) {
	
	  Metodo e = new Metodo();
	  e.escrever();
	  System.out.println(e.recebe());
	  
	   
  }
}
