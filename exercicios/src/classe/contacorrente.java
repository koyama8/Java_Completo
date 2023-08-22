package classe;
/*
 Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: 
n�mero da conta, nome do correntista e saldo. Os m�todos s�o os seguintes: alterarNome, dep�sito e 
saque; No construtor, saldo � opcional, com valor default zero e os demais atributos s�o obrigat�rios.
 */
public class contacorrente {
  
	private int conta;
    private String nome_correntista;
    private double saldo;
    
    public contacorrente(double saldo) {
    	
    	this.saldo = saldo;
    }
    
    public void alteraNome(String novoNome) {
    	
    	this.nome_correntista = novoNome;
    	
    }
    
    public void alterarSaldo(double novosaldo) {
    	
    	this.saldo += novosaldo;
    	System.out.println(saldo);
    }
    
    public void alterarSaque(double novosaque) {
    	this.saldo -= novosaque;
    	System.out.println(saldo);
    }
    
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getNome_correntista() {
		return nome_correntista;
	}
	public void setNome_correntista(String nome_correntista) {
		this.nome_correntista = nome_correntista;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    public String toString() {
    	return nome_correntista;
    }
  
}
