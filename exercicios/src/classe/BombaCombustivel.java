package classe;

public class BombaCombustivel {
    
	String tipo_combustivel;
	double valor_litro;
	double qtd_combustivel;
	
	
	public BombaCombustivel(String tipo_combustivel, double valor_litro, double qtd_combustivel) {
		
		this.tipo_combustivel = tipo_combustivel;
		this.valor_litro = valor_litro;
		this.qtd_combustivel = qtd_combustivel;
	}
	
	
	
	//método onde é informado o valor a ser abastecido e mostra a quantidade de 
	//litros que foi colocada no veículo
	 public void abastecerPorValor(){
	   
		 System.out.println("Valor abastecido: " + valor_litro + " Quantidade de litros: " + qtd_combustivel);
       
	}
	 
	  // método onde é informado a quantidade em litros de combustível
	  //e mostra o  valor a ser pago pelo cliente
	 public void abastecerPorLitro(float valor_pago) {
	       
		 double qtotal = this.qtd_combustivel-(valor_pago/valor_litro);
		 
		 if(valor_pago< 0) {
			 System.out.println("Informe novamente");
		 }else if(qtotal < 0) {
			 System.out.println("Combustivel insuficiente na bomba");
		 }else {
			 System.out.println("A quantidade de combustivel = "+qtotal);
		 }
	 }
	   
	 /**
	   alterarValor; //altera o valor do litro do combustível.
      
	  */
	  public void alteraValor(double novoValor) {
		  
		  this.valor_litro= novoValor;
	  }
	  

      public void alteraCombustivel(String novoTipo) {
		  
		  this.tipo_combustivel = novoTipo;
	  }
	  

}
