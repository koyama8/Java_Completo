package classe;

public class pessoa {
   
	private String nome;
	private String data_nascimento;
	private double altura;
	
	public pessoa(String nome, String data_nascimento, double altura) {
		
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getData_nascimento() {
		return data_nascimento;
	}
	
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public String toString() {
		
		return "Nome:" + getNome()+", Altura:"+ getAltura() +", Data de nascimento:" +getData_nascimento();
	}
}
