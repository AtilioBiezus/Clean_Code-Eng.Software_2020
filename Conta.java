package ArrayList;

public class Conta {
	private String agencia;
	private String conta;
	
	public Conta (String agencia, String conta) {
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	@Override
	public String toString() {
		return "Agencia: " + this.agencia + " - Conta: " + this.conta;
	}
	
}
